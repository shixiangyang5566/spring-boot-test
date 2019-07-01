package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Provider;
import org.apache.ibatis.annotations.*;

/**
 * @Author: sxy
 * @Date: 2019/6/30 18:03
 * @Version 1.0
 */
@Mapper
public interface ProviderMapper {
    @Select("select * from provider where pid=#{pid}")
    Provider getProviderByPid(Integer pid);

    //是否使用自增主键
    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into provider(providerName,people) values (#{providerName},#{people})")
    int addProvider(Provider provider);
    @Delete("delete from provider where pid=#{pid}")
    int delProvider(Integer pid);
    @Update("update provider set providerName=#{providerName} where pid=#{pid}")
    int updateProvider(Provider provider);
}
