package com.Miikuni.springbootdemo.SpringIntegration.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 整合Listener方法二
 */
public class SecondListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent event) {

    }

    //初始化listener事件
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Second....Listener ...Init....");
    }
}
