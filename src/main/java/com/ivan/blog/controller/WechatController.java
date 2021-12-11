package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WechatController {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login_authentication() {
        return "login";
    }
}
