package com.mengxuegu.springboot.dao;

import com.mengxuegu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: sxy
 * @Date: 2019/6/30 22:55
 * @Version 1.0
 */
//指定泛型<操作的实体类，主键的数据类型>
public interface UserRepository extends JpaRepository<User,Integer> {
}
