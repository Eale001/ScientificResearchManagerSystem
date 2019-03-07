package com.eale.scientificresearchmanagersystem.system.controller.login;

import com.eale.scientificresearchmanagersystem.system.bean.user.User;
import com.eale.scientificresearchmanagersystem.system.service.SystemService;
import com.eale.scientificresearchmanagersystem.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.UnknownHostException;
import java.util.Objects;

@Controller
@RequestMapping("longin")
public class LoginController {

    @Autowired
    private SystemService systemService;

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



    public String logincheck(HttpSession session){
        return null;
    }

}
