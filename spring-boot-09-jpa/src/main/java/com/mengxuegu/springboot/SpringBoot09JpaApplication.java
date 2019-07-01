package com.mengxuegu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启注解的事务
public class SpringBoot09JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot09JpaApplication.class, args);
    }

}
