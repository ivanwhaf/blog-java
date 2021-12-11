package com.ivan.blog.bean.vo;

import com.ivan.blog.bean.Article;

import java.util.List;

public class Page {
    public List<Article> articlesLst;
    public int articlesCount;
    public List<Article> popularArticlesLst;
    public int pageNum;
    public int visitorsCount;

    public int getArticlesCount() {
        return articlesCount;
    }

    public void setArticlesCount(int articlesCount) {
        this.articlesCount = articlesCount;
    }

    public List<Article> getPopularArticlesLst() {
        return popularArticlesLst;
    }

    public void setPopularArticlesLst(List<Article> popularArticlesLst) {
        this.popularArticlesLst = popularArticlesLst;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getVisitorsCount() {
        return visitorsCount;
    }

    public void setVisitorsCount(int visitorsCount) {
        this.visitorsCount = visitorsCount;
    }

    public List<Article> getArticlesLst() {
        return articlesLst;
    }

    public void setArticlesLst(List<Article> articlesLst) {
        this.articlesLst = articlesLst;
    }
}
