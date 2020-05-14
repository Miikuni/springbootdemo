package com.Miikuni.springbootdemo.com.Miikuni.config;

import com.Miikuni.springbootdemo.com.Miikuni.SpringServlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Servlet的配置类
 */
@Configuration
public class ServletConfig {

    /**
     * 完成Servlet组件的注册
     */
    @Bean //在配置类中用@Bean注释的方法都会自动被执行
    //方法要返回一个ServletRegistrationBean对象
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
