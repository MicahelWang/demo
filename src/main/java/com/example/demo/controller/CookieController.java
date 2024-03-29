package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CookieController {


    @RequestMapping("/test/cookie")
    public String cookie(@RequestParam("browser") String browser, HttpServletRequest request, HttpSession  session){
        Object sessionBrowser = session.getAttribute("browser");
        if (sessionBrowser==null)
        {
            System.out.println("不存在的session,设置 browser="+browser);
            session.setAttribute("browser",browser);
        }else{
            System.out.println("存在 session, browser="+sessionBrowser.toString());
        }

        Cookie[] cookies = request.getCookies();
        if (cookies!=null && cookies.length>0){
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName()+":"+cookie.getValue());
            }
        }
        return "index";
    }
}
