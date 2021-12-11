package com.ivan.blog.dao;

import com.ivan.blog.bean.Article;
import com.ivan.blog.bean.vo.Page;

import java.util.List;

public interface BlogDao {
    public List<Article> getAllArticles();
    public int getArticlesCount();
    public List<Article> getArticles(int start,int num);
    public List<Article> getPopularArticles();

    public int getVisitorsCount();
}
