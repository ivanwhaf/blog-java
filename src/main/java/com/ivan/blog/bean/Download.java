package com.ivan.blog.bean;

import java.util.Date;

public class Download {
    public int id;
    public String filename;
    public String ip;
    public String location;
    public Date downloadDate;
    public String platform;
    public String browser;
    public String version;

    public Download(int id, String filename, String ip, String location, Date downloadDate, String platform, String browser, String version) {
        this.id = id;
        this.filename = filename;
        this.ip = ip;
        this.location = location;
        this.downloadDate = downloadDate;
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

    public Date getDownloadDate() {
        return downloadDate;
    }

    public void setDownloadDate(Date downloadDate) {
        this.downloadDate = downloadDate;
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
