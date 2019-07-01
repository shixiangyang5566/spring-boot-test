package com.mengxugu.springboot.config;

import com.mengxugu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration说明是一个配置类
 * @Bean 标识的方法用于向容器中注入组件
 * 返回值HelloService 就是容器中的对象，方法名helloService2就是id值
 * @Author: sxy
 * @Date: 2019/5/30 10:49
 * @Version 1.0
 */
@Configuration
public class EmpConfig {
    /**
     * 1.返回值就是注入容器中的组件对象
     * 2.方法名就是这个组件的id值
     * @return
     */
    @Bean
    public HelloService helloService2(){
        System.out.println("helloService组件注册成功");
        return new HelloService();
    }
}
