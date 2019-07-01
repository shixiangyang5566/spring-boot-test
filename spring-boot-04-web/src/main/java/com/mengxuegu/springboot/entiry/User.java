package com.mengxuegu.springboot.entiry;

/**
 * @Author: sxy
 * @Date: 2019/5/31 9:00
 * @Version 1.0
 */
public class User {
    private String name;
    //1 男生，2女生
    private Integer gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public User(String name, Integer gender) {
        this.name = name;
        this.gender = gender;
    }
    public User(){}
}
