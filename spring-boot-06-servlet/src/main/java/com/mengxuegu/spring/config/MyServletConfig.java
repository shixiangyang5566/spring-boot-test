package com.mengxuegu.spring.config;

import com.mengxuegu.spring.filter.MyFilter;
import com.mengxuegu.spring.listener.MyListener;
import com.mengxuegu.spring.servlet.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Author: sxy 相关组件
 * @Date: 2019/6/28 14:27
 * @Version 1.0
 */
@Configuration
public class MyServletConfig {
    /**
     * 注册servlet组件
     */
    @Bean
    public ServletRegistrationBean<HelloServlet> helloServlet() {
        ServletRegistrationBean<HelloServlet> bean = new ServletRegistrationBean<>(new HelloServlet(), "/hello");
        bean.setLoadOnStartup(1);
        return bean;
    }

    /**
     * 注册filter组件
     */
    @Bean
    public FilterRegistrationBean<MyFilter> myFilter() {
        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        //设置自定义的filter
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello"));
        return filterRegistrationBean;

    }

    /**
     * 注册自定义的容器启动监听器
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<MyListener> bean = new ServletListenerRegistrationBean<>(new MyListener());
        return bean;
    }


}
