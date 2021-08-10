package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlbumController {
    @RequestMapping("/album")
    public String album(){
        return "album";
    }
}
