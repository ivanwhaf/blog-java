package com.ivan.blog.bean;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class Article {
    private int id;
    private String title;
    private String subtitle;
    private String tag;
    private String content_md;
    private String content_html;
    private String content_text;
    private String author;
    private short author_id;
    private short read_count;
    private Timestamp create_date;
    private Timestamp last_edit_date;

    public Article() {
    }
}
