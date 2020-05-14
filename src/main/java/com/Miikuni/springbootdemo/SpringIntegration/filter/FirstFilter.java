package com.Miikuni.springbootdemo.SpringIntegration.filter;

import javax.servlet.*;  //导入的是servlet里面的Filter
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 整合Filter方法一
 */
//@WebFilter(filterName = "FirstFilter",urlPatterns ={"*.do","*.jsp"} )
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first") //urlPatterns参数是要拦截的请求路径，或者给个数组，像上面的写法，拦截一些后缀名的
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //过滤或者拦截的时候所用到的方法
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入First Filter");
        //放行请求
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开First Filter");
    }

    @Override
    public void destroy() {

    }
}
