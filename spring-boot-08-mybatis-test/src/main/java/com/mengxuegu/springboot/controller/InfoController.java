package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.entities.Info;
import com.mengxuegu.springboot.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * @Author: sxy
 * @Date: 2019/6/26 23:48
 * @Version 1.0
 */
@RestController
@CrossOrigin
public class InfoController {
    @Autowired
    private InfoMapper infoMapper;

    /**
     * 根据id查询某个title的描述
     * @param id
     * @return
     */
    @RequestMapping("/list/{id}")
    public Info getInfoListById(@PathVariable("id") Integer id){
        Info info = infoMapper.getInfoById(id);
        return info;
    }

    /**
     * 查询所有的title
     * @return
     */
    @RequestMapping("/list/")
    public ArrayList<Info> getInfoListById(){
        ArrayList<Info> infoList = infoMapper.getInfoList();
        return infoList;


    }

}
