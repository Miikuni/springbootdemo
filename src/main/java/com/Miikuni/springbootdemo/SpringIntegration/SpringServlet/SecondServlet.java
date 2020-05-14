package com.Miikuni.springbootdemo.SpringIntegration.SpringServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 整合Servlet方法二
 */
public class SecondServlet extends HttpServlet {

    //重写doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Second Servlet.......");
    }
}
