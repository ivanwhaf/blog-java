package com.ivan.blog.bean;

import java.util.Date;

public class Comment {
    public int id;
    public int articleId;
    public String replyName;
    public String content;
    public Date commentDate;
    public String osName;
    public String browser;
    public String ip;
    public String location;
    public int reviewerId;
    public String reviewer;

    public Comment(int id, int articleId, String replyName, String content, Date commentDate, String osName, String browser, String ip, String location, int reviewerId, String reviewer) {
        this.id = id;
        this.articleId = articleId;
        this.replyName = replyName;
        this.content = content;
        this.commentDate = commentDate;
        this.osName = osName;
        this.browser = browser;
        this.ip = ip;
        this.location = location;
        this.reviewerId = reviewerId;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(int reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
