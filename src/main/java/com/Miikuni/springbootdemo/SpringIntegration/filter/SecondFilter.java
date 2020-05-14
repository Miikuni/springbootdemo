package com.Miikuni.springbootdemo.SpringIntegration.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 整合Filter方法二
 */
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //过滤或者拦截的时候所用到的方法
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入Second Filter");
        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开Second Filter");
    }

    @Override
    public void destroy() {

    }
}
