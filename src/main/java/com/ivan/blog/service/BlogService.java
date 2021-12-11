package com.ivan.blog.service;

import com.ivan.blog.bean.Article;
import com.ivan.blog.bean.vo.Page;

import java.util.List;

public interface BlogService {
    public List<Article>getAllArticles();
    public int getArticlesCount();
    public Page getPage(int page);
}
