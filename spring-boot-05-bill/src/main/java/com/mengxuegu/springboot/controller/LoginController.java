package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author: sxy
 * @Date: 2019/5/31 15:38
 * @Version 1.0
 */
@Controller
public class LoginController {
    //登录
    @PostMapping("/login")
    public String login(HttpSession session, String username, String password, Map<String, Object> map) {
        //判断用户名不为空，并且密码为123则登录成功
        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            //将用户名放入session中，在拦截器中判断当前session中是否有用户的信息，进行拦截
            session.setAttribute("loginUser", username);
            //表示登录成功,进行重定向，防止表单重复提交
            return "redirect:/main.html";
        }
        //登录失败
        map.put("msg", "用户名或者密码错误");
        return "main/login";
    }
    //退出
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        //1.清空session中的用户信息
        session.removeAttribute("loginUser");
        //2.注销session
        session.invalidate();
        return "redirect:/index.html";
    }
}
