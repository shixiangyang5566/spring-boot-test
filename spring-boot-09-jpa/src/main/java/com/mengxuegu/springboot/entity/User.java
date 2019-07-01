package com.mengxuegu.springboot.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: sxy jpa采用的是orm模型
 * @Date: 2019/6/30 22:22
 * @Version 1.0
 */
@Entity//说明他是和数据表映射的类
@Table(name = "tb_user")//指定对应的映射的表名，省略不写的话表示表明和类名相同
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name", length = 5)
    private String userName;
    @Column//省略不写默认字段名就是属性名
    private String password;
    @Column(name = "real_name", length = 25)
    private String realName;
    @Column
    private Integer gender;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;
    @Column(name = "user_type")
    private Integer userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public User(String userName, String password, String realName, Integer gender, Integer userType) {
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
        this.userType = userType;
    }

    public User() {}
}
