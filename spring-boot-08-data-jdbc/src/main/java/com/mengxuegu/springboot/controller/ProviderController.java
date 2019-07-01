package com.mengxuegu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: sxy
 * @Date: 2019/6/30 14:31
 * @Version 1.0
 */
@RestController
public class ProviderController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/providers")
    public Map list(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from provider");
        Map<String, Object> map = maps.get(0);
        return map;
    }
}
