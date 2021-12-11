package com.ivan.blog.bean;

import java.util.Date;

public class Visitor {
    public int id;
    public String ip;
    public String location;
    public Date visitDate;
    public String platform;
    public String browser;
    public String version;

    public Visitor(int id, String ip, String location, Date visitDate, String platform, String browser, String version) {
        this.id = id;
        this.ip = ip;
        this.location = location;
        this.visitDate = visitDate;
        this.platform = platform;
        this.browser = browser;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
