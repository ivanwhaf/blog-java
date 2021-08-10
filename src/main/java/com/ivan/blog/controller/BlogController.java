package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/id")
    public String indexId() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/archive")
    public String archive() {
        return "archive";
    }

    @RequestMapping("/tags")
    public String tags() {
        return "tags";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }
    @RequestMapping("/edit")
    public String edit() {
        return "edit";
    }
    @RequestMapping("/search")
    public String search() {
        return "search";
    }

    @RequestMapping("/video")
    public String video() {
        return "video";
    }

    @RequestMapping("/echarts")
    public String echarts() {
        return "echarts";
    }

    @RequestMapping("/study")
    public String study() {
        return "study";
    }
}
