package com.mengxuegu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//会自动装配扫描包下面的所有的mapper接口，可以不用再每个接口上配置@Mapper
@MapperScan("com.mengxuegu.springboot.mapper")
public class SpringBoot08MybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot08MybatisTestApplication.class, args);
    }

}
