package com.ivan.blog.controller;

import com.ivan.blog.bean.vo.Page;
import com.ivan.blog.service.BlogService;
import com.oracle.webservices.internal.api.message.PropertySet;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request, Model model) {
        System.out.println(request.getHeader("User-Agent"));
        System.out.println(request.getRemoteAddr());

        int articlesCount = blogService.getArticlesCount();

        // 页码范围非法则返回404
        if (10 * (page - 1) >= articlesCount || page < 1) {
            return "404";
        }
        if (page == 1) {
            String ip = request.getRemoteAddr();
        }

        Page p = blogService.getPage(page);
        model.addAttribute("page",p);
        return "index";
    }

    @RequestMapping(value = "/article/{tag}/{id}", method = RequestMethod.GET)
    public String article(@PathVariable String tag, @PathVariable String id) {
        System.out.println(tag);
        System.out.println(tag);
        return "article";
    }

    @RequestMapping(value = "/manage", method = RequestMethod.GET)
    public String manage() {
        return "manage";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

    @RequestMapping(value = "/archives", method = RequestMethod.GET)
    public String archives() {
        return "archives";
    }

    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    public String tags() {
        return "tags";
    }

    @RequestMapping(value = "/article/search", method = RequestMethod.GET)
    public String search() {
        return "search";
    }

}
