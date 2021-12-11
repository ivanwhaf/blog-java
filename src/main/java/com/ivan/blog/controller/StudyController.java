package com.ivan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudyController {
    @RequestMapping(value = "/study", method = RequestMethod.GET)
    public String study() {
        return "study";
    }
}
