package com.mengxuegu.springboot.service.impl;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: sxy
 * @Date: 2019/7/1 9:27
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)//开启事务管理,隔离级别和传播行为
    public Boolean addUser(User user) {
        userRepository.save(new User("1","123","张三",1,1));
        userRepository.save(new User("2","123","李四",1,1));
        userRepository.save(new User("3","123","王五",1,1));
        userRepository.save(new User("4","123","赵六",1,1));
//        userRepository.save(new User("455555","123","赵六",1,1));
//        userRepository.save(new User("45556","123","赵六",1,1));

        User save = userRepository.save(user);
        return null;
    }
}
