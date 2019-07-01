package templates;

import com.mengxuegu.springboot.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: sxy
 * @Date: 2019/5/31 14:11
 * @Version 1.0
 */
@Configuration
public class MySpringMvcConfigurer {
    //配置视图管理器
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
       return new WebMvcConfigurer(){
           //添加视图控制
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("main/login");
                registry.addViewController("/index.html").setViewName("main/login");
                registry.addViewController("/main.html").setViewName("main/index");
            }
        //添加登录拦截器
           @Override
           public void addInterceptors(InterceptorRegistry registry) {
               registry.addInterceptor(new LoginHandlerInterceptor())
                       .addPathPatterns("/**")
                       //排除不需要拦截的请求
                       .excludePathPatterns("/","/index.html","/login")
                       //spring2+之后需要将静态文件也排除
                       .excludePathPatterns("/css/*","/img/*","/js/*");
           }
       };
    }
}
