package com.ivan.blog.bean;

import java.util.Date;

public class Article {
    public int id;
    public String title;
    public String subtitle;
    public String tag;
    public String contentMd;
    public String contentHtml;
    public String contentText;
    public String author;
    public int authorId;
    public int readCount;
    public Date createDate;
    public Date lastEditDate;

    public Article(){}

    public Article(int id, String title, String subtitle, String tag, String contentMd, String contentHtml, String contentText, String author, int authorId, int readCount, Date createDate, Date lastEditDate) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.tag = tag;
        this.contentMd = contentMd;
        this.contentHtml = contentHtml;
        this.contentText = contentText;
        this.author = author;
        this.authorId = authorId;
        this.readCount = readCount;
        this.createDate = createDate;
        this.lastEditDate = lastEditDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContentMd() {
        return contentMd;
    }

    public void setContentMd(String contentMd) {
        this.contentMd = contentMd;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", tag='" + tag + '\'' +
                ", contentMd='" + contentMd + '\'' +
                ", contentHtml='" + contentHtml + '\'' +
                ", contentText='" + contentText + '\'' +
                ", author='" + author + '\'' +
                ", authorId=" + authorId +
                ", readCount=" + readCount +
                ", createDate=" + createDate +
                ", lastEditDate=" + lastEditDate +
                '}';
    }

}
