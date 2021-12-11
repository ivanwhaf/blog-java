package com.ivan.blog.bean;

import java.util.Date;

public class Dictionary {
    public int id;
    public String key_;
    public String value_;
    public String keyType;
    public String valueType;
    public Date createDate;

    public Dictionary(int id, String key_, String value_, String keyType, String valueType, Date createDate) {
        this.id = id;
        this.key_ = key_;
        this.value_ = value_;
        this.keyType = keyType;
        this.valueType = valueType;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey_() {
        return key_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public String getValue_() {
        return value_;
    }

    public void setValue_(String value_) {
        this.value_ = value_;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
