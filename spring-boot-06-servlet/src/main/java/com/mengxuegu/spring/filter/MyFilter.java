package com.mengxuegu.spring.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: sxy
 * @Date: 2019/6/30 8:44
 * @Version 1.0
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化操作");
    }

    @Override
    public void destroy() {
        System.out.println("filter的销毁");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter过滤完成");
        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
