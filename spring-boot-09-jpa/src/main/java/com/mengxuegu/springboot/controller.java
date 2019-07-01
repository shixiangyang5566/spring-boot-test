package com.mengxuegu.springboot;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: sxy
 * @Date: 2019/6/30 23:07
 * @Version 1.0
 */
@RestController
public class controller {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private IUserService userService;

    /**
     * 根据id查询user对象
     *
     * @param id
     * @return
     */
    @GetMapping("user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        User user = userOptional.get();
        return user;
    }

    /**
     * 保存user对象
     *
     * @param user
     * @return
     */
    @PostMapping("/user")
    public User addUser(User user) {
        User user2 = userRepository.save(user);
        return user2;
    }

    /**
     * 模拟事务操作，进行回滚
     *
     * @param user
     * @return
     */
    @PostMapping("/user2")
    public User addUser2(User user) {
        userService.addUser(user);
        return user;
    }


}
