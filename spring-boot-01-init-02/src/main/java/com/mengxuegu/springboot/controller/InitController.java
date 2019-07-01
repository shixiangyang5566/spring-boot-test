package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: sxy
 * @Date: 2019/5/29 17:52
 * @Version 1.0
 */
@Controller
@ResponseBody
public class InitController {
    @RequestMapping("/info")
    public String init(){
        return "hello init";
    }
}
