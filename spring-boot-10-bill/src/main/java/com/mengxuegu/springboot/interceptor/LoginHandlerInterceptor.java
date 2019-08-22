package com.mengxuegu.springboot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *登录拦截器
 * @Author: sxy
 * @Date: 2019/5/31 16:03
 * @Version 1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser!=null){
            //说明已经登录过，进行放行
            return true;
        }
        //没有登录过
        request.setAttribute("msg","没有权限，请先登录");
        request.getRequestDispatcher("/index.html").forward(request,response);
        return false;
    }
}
