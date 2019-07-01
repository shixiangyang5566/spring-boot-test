package com.mengxugu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: sxy
 * @Date: 2019/5/29 16:29
 * @Version 1.0
 */
@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
