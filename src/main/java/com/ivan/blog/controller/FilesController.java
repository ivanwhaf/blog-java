package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilesController {
    @RequestMapping("/files")
    public String files(){
        return "files";
    }
}
