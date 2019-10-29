package cn.smbms.controller;

import cn.smbms.tools.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清除session
        if(session != null){
            session.removeAttribute(Constants.USER_SESSION);
        }
        return "init/login" ;
    }
}
