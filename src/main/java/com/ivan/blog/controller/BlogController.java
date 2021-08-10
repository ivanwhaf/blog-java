package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/archives")
    public String archive() {
        return "archives";
    }

    @RequestMapping("/tags")
    public String tags() {
        return "tags";
    }

    @RequestMapping("/article/add")
    public String add() {
        return "add_article";
    }

    @RequestMapping("/article/<tag>/<id>/edit")
    public String edit() {
        return "edit_article";
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
