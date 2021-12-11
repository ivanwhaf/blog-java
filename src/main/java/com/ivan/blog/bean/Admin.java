package com.ivan.blog.bean;

import java.util.Date;

public class Admin {
    public int id;
    public String username;
    public String password;
    public String nickname;
    public String sex;
    public int authority;
    public String avatar;
    public Date registerDate;

    public Admin(int id, String username, String password, String nickname, String sex, int authority, String avatar, Date registerDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.sex = sex;
        this.authority = authority;
        this.avatar = avatar;
        this.registerDate = registerDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

}
