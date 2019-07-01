package com.mengxuegu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //1.下面定义的都是日志级别，由低到高：trace<debug<info<warn<error
        //2.spring boot 默认是info级别（也成为root级别）
        //3.可以通过配置文件修改日志级别，设置某个级别后，只会打印此级别和更高级别的日志。
        logger.trace("这是trace日志信息");
        logger.debug("这是debug日志信息");
        logger.info("这是info日志信息");
        logger.warn("这是warn日志信息");
        logger.error("这是errorr日志信息");
    }

}
