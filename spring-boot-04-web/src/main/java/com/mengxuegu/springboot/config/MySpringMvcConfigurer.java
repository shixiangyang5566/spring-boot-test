package com.mengxuegu.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: sxy
 * @Date: 2019/5/31 10:46
 * @Version 1.0
 */
@Configuration
public class MySpringMvcConfigurer implements WebMvcConfigurer {
    //增加视图控制
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //发送/mengxuegu 请求，会来到success.html页面
        registry.addViewController("/mengxuegu").setViewName("success");
    }
}
