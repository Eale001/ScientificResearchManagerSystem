package com.eale.scientificresearchmanagersystem.system.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("longin")
public class LoginController {

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

    public String logincheck(HttpSession session){
        return null;
    }

}
