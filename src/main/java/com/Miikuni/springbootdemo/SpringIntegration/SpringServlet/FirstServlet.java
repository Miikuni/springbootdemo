package com.Miikuni.springbootdemo.SpringIntegration.SpringServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 整合Servlet方法一
 */

@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

    //重写doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("First Servlet.......");
    }
}
