package com.mengxugu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 说明这是一个引导类，说明当前是一个springboot项目
 *      @SpringBootConfiguration
 *          @Configuration 他属于spring中的注解，定义配置类，等价与配置文件
 *              @Component 添加到spring容器当中，标识是一个组件
 *      @EnableAutoConfiguration
 *          @AutoConfigurationPackage将引导类所在包及其子包下面所有的组件添加到spring容器
 *          @Import({AutoConfigurationImportSelector.class})
 *              1.将所有组件以全类名的方式返回，并且添加到spring容器中
 *              2.给容器导入非常多的自动配置类（****.AutoConfiguration）,自动配置类就相当于配置文件，就是
 *              导入并配置好很多当前项目中需要的配置文件。
 *      @ComponentScan 被该注解标识的类，会被spring容器进行管理
 *
 *
 * @Author: sxy
 * @Date: 2019/5/29 16:33
 * @Version 1.0
 */
@SpringBootApplication
public class HelloMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMainApplication.class,args);
    }
}
