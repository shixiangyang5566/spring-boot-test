package com.mengxuegu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot08DataJdbcApplicationTests {

    @Autowired
    private DataSource dataSource;

    /**
     * 测试数据库连接
     * @throws SQLException
     */
    @Test
    public void contextLoads() throws SQLException {
        //dataSource:class com.zaxxer.hikari.HikariDataSource
        System.out.println("dataSource:"+dataSource.getClass());
        Connection connection = dataSource.getConnection();
        //HikariProxyConnection@934640468 wrapping com.mysql.cj.jdbc.ConnectionImpl@5c1f6d57
        System.out.println(connection);

    }

}
