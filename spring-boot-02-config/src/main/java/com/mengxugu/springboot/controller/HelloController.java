package com.mengxugu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: sxy
 * @Date: 2019/5/30 9:17
 * @Version 1.0
 */
@Controller
@ResponseBody
public class HelloController {
    @Value("${emp.lastName}")
    private String lastName;
    @RequestMapping("/hello")
    public String hello(){
        return "hello"+lastName;
    }

}
