package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/manage")
    public String manage(){
        return "manage";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
    @RequestMapping("/add_admin")
    public String addAdmin(){
        return "add_admin";
    }
}
