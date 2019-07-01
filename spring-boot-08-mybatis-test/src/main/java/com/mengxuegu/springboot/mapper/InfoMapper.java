package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * @Author: sxy
 * 针对mybatis的注解版
 * @Date: 2019/6/26 23:40
 * @Version 1.0
 */
@Mapper
public interface InfoMapper {
    @Select("select * from info where id =#{id}")
    Info getInfoById(Integer id);
    @Select("select * from info ")
    ArrayList<Info> getInfoList();
}
