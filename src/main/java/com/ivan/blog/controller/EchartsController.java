package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EchartsController {
    @RequestMapping(value = "/echarts", method = RequestMethod.GET)
    public String echarts() {
        return "echarts";
    }
}
