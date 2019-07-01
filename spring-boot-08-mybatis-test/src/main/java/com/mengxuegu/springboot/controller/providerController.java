package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Provider;
import com.mengxuegu.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: sxy
 * @Date: 2019/6/30 18:10
 * @Version 1.0
 */
@RestController
public class providerController {

    @Autowired
    private ProviderMapper providerMapper;

    /**
     * 根据pid查询数据
     * @param pid
     * @return
     */
    @GetMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") Integer pid) {
        Provider provider = providerMapper.getProviderByPid(pid);
        return provider;
    }

    /**
     * 添加provider
     * @param provider
     * @return
     */
    @GetMapping("/provider")
    public Provider addProvider( Provider provider){
        int i = providerMapper.addProvider(provider);
        return provider;
    }
}
