package com.ivan.blog.bean;

import java.util.Date;

public class Upload {
    public int id;
    public String filename;
    public String ip;
    public String location;
    public Date uploadDate;
    public String platform;
    public String browser;
    public String version;

    public Upload(int id, String filename, String ip, String location, Date uploadDate, String platform, String browser, String version) {
        this.id = id;
        this.filename = filename;
        this.ip = ip;
        this.location = location;
        this.uploadDate = uploadDate;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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
