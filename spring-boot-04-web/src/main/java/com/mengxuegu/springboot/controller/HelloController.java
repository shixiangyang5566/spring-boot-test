package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entiry.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: sxy
 * @Date: 2019/5/30 18:35
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/success")
    public String success(Map<String, String> map) {
        map.put("name", "梦学谷");
        //去访问templates/success.html
        return "success";
    }

    @RequestMapping("/study")
    public String study(Map<String, Object> map) {
        List<User> list = new ArrayList<>();
        list.add(new User("小梦", 1));
        list.add(new User("小李", 2));
        list.add(new User("小张", 1));
        map.put("userList", list);
        return "study";
    }
}
