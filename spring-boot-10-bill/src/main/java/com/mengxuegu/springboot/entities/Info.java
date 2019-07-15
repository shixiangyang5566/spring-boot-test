package com.mengxuegu.springboot.entities;

import java.io.Serializable;

/**
 * @Author: sxy
 * @Date: 2019/6/26 23:42
 * @Version 1.0
 */

public class Info implements Serializable {
    private Integer id;
    private String title;
    private String describe;
    private String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", describe='" + describe + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
