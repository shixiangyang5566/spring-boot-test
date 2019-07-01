package com.mengxugu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ImportResource(locations = {"classpath:helloService.xml"})
 * 导入spring配置文件，并将它加载到容器中，需要指定自定义的文件名。
 */
//@ImportResource(locations = {"classpath:helloService.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }

}
