package com.mengxugu.springboot;

import com.mengxugu.springboot.bean.Emp;
import com.mengxugu.springboot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    Emp emp;
    /**
     * 获取spring容器应用上下文，拿到应用上下文可以拿到任何配置的bean对象
     */
    @Autowired
    ApplicationContext context;
//    @Autowired
//    HelloService helloService;


    @Test
    public void test() {
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.add();
    }
    @Test
    public void test1() {
        HelloService helloService = (HelloService) context.getBean("helloService2");
        helloService.add();
    }

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

}
