package com.eale.scientificresearchmanagersystem.system.controller.login;

import com.eale.scientificresearchmanagersystem.system.bean.system.SystemMenu;
import com.eale.scientificresearchmanagersystem.system.bean.user.Client;
import com.eale.scientificresearchmanagersystem.system.bean.user.User;
import com.eale.scientificresearchmanagersystem.system.manager.ClientManager;
import com.eale.scientificresearchmanagersystem.system.service.SystemMenuService;
import com.eale.scientificresearchmanagersystem.system.service.SystemService;
import com.eale.scientificresearchmanagersystem.system.service.UserService;
import com.eale.scientificresearchmanagersystem.system.util.ContextHolderUtils;
import com.eale.scientificresearchmanagersystem.system.util.NumberComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.UnknownHostException;
import java.util.*;

@Controller
@RequestMapping("longin")
public class LoginController {

    @Autowired
    private SystemService systemService;

    @Autowired
    private SystemMenuService systemMenuService;

    @Autowired
    private UserService userService;

    public static final String CAPTCHA_KEY = "session_captcha";

    /**
     * 登录界面的显示
     * @return
     */
    @RequestMapping(value = "logins",method = RequestMethod.GET)
    public String login(){
        return "login/login";
    }

    /**
     * 注销登录
     * @param session
     * @return
     */
    @RequestMapping("loginout")
    public String loginout(HttpSession session){
        session.removeAttribute("userId");
        return "redirect:/logins";
    }

    /**
     * 登录检查
     * @param session
     * @param req
     * @param model
     * @return
     * @throws UnknownHostException
     */
    @RequestMapping(params = "login")
    @ResponseBody
    public String logincheckuser(HttpSession session, HttpServletRequest req, Model model)throws UnknownHostException {

        String userName=req.getParameter("userName").trim();
        String password=req.getParameter("password");
        String ca=req.getParameter("code").toLowerCase();
        String sesionCode = (String) req.getSession().getAttribute(CAPTCHA_KEY);
        model.addAttribute("userName", userName);
        if(!ca.equals(sesionCode.toLowerCase())){
            model.addAttribute("errormess", "验证码输入错误!");
            req.setAttribute("errormess","验证码输入错误!");
            return "login/login";
        }
        /*
         * 将用户名分开查找；用户名或者电话号码；
         * */
        User user=new User();
        user.setUserName(userName);
        user.setPassword(password);

        User user1=userService.checkUserExits(user);

        if(Objects.isNull(user1)){
            model.addAttribute("errormess", "账号或密码错误!");
            return "login/login";
        }
        //是否被锁
        if(user.getIsLock()==1){
            model.addAttribute("errormess", "账号已被冻结!");
            return "login/login";
        }
        //是否已经登录
        if(session.getAttribute("userId")==user.getUserId()){
            model.addAttribute("hasmess", "当前用户已经登录了；不能重复登录");
            session.setAttribute("thisuser", user);
            return "login/login";
        }else{
            session.setAttribute("userId", user.getUserId());
        }
        return "main/shortcut_main";
    }

    /**
     * 获取权限的Map
     * @param user
     * @return
     */
    private Map<Integer, List<SystemMenu>> getMenuMap(User user){
        HttpSession session= ContextHolderUtils.getSession();
        Client client= ClientManager.getInstance().getClient(session.getId());
        if(null==client.getMenuMap() || client.getMenuMap().size() == 0){
            Map<Integer,List<SystemMenu>> systemMenu=new HashMap<>();
            Map<String,SystemMenu> loginActionMap=getUserMenus(user);
            if (loginActionMap.size()>0){
                Collection<SystemMenu> allMenus=loginActionMap.values();
                for (SystemMenu menu: allMenus) {
                    if (!systemMenu.containsKey(menu.getMenuGrade())){
                        systemMenu.put(menu.getMenuGrade(),new ArrayList<SystemMenu>());
                    }
                    systemMenu.get(menu.getMenuGrade()).add(menu);
                }
                //菜单栏排序
                Collection<List<SystemMenu>> collection=systemMenu.values();
                for (List<SystemMenu> list: collection) {
                    Collections.sort(list,new NumberComparator());
                }
            }
            client.setMenuMap(systemMenu);
            //清空变量
            loginActionMap.clear();

            return systemMenu;
        }else {
            return client.getMenuMap();
        }

    }

    /**
     * 获取用户菜单列表
     * @param user
     * @return
     */
    private Map<String, SystemMenu> getUserMenus(User user) {
        HttpSession session=ContextHolderUtils.getSession();
        Client client=ClientManager.getInstance().getClient(session.getId());

        if (client.getMenus() == null || client.getMenus().size()==0){
            Map<String,SystemMenu> loginActionlist=new HashMap<>();
            List<SystemMenu> list=systemMenuService.findAllSystemMenu(user);
            for (SystemMenu menu:list) {
                loginActionlist.put(menu.getMenuId()+"",menu);
            }
            client.setMenus(loginActionlist);
            //清空变量 ,降低内存使用
            list.clear();
        }
        return client.getMenus();
    }

    /**
     * 首页跳转
     *
     * @param request
     * @return
     */
    @RequestMapping(params = "home")
    public ModelAndView home(HttpServletRequest request){
        return new ModelAndView("main/home");
    }

    /**
     * shortcut_top头部菜单请求
     * @param request
     * @return
     */
    @RequestMapping(params = "shortcut_top")
    public ModelAndView shortcut_top(HttpServletRequest request){
        HttpSession session=ContextHolderUtils.getSession();
        User user=ClientManager.getInstance().getClient(session.getId()).getUser();
        //登录验证
        if (user.getUserId()==null){
            session.removeAttribute("userId");
            return new ModelAndView(
                    new RedirectView("login/logins")
            );
        }
        request.setAttribute("menuMap",getMenuMap(user));
        return new ModelAndView("main/shortcut_top");
    }

    @RequestMapping(params = "primaryMenu")
    @ResponseBody
    public String getPrimaryMenu(){
        HttpSession session=ContextHolderUtils.getSession();
        List<SystemMenu> primaryMenu=getMenuMap(ClientManager.getInstance().getClient(session.getId()).getUser()).get(0);

        String floor="";

        if (null==primaryMenu){
            return floor;
        }
        for (SystemMenu menu:primaryMenu) {
            if (menu.getMenuGrade()==0){
                String lang_key=menu.getMenuName();
                String s="";
                if(lang_key.length()>=5 && lang_key.length()<7){
                    s = "<div style='width:67px;position: absolute;top:40px;text-align:center;color:#909090;font-size:12px;'><span style='letter-spacing:-1px;'>"+ lang_key +"</span></div>";
                }else if(lang_key.length()<5){
                    s = "<div style='width:67px;position: absolute;top:40px;text-align:center;color:#909090;font-size:12px;'>"+ lang_key +"</div>";
                }else if(lang_key.length()>=7){
                    s = "<div style='width:67px;position: absolute;top:40px;text-align:center;color:#909090;font-size:12px;'><span style='letter-spacing:-1px;'>"+ lang_key.substring(0, 6) +"</span></div>";
                }
                floor += " <li style='position: relative;'><img class='imag1' src='plug-in/login/images/default.png' /> "
                        + " <img class='imag2' src='plug-in/login/images/default_up.png' style='display: none;' />"
                        + s +"</li> ";
            }
        }

        return floor;
    }



}
