package com.mengxuegu.spring.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: sxy自定义listener组件
 * 测试的是关于应用的启动与关闭
 * @Date: 2019/6/30 8:59
 * @Version 1.0
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("spring boot .servlet应用启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("spring boot .servlet应用销毁");
    }
}
