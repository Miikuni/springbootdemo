package com.Miikuni.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring boot 启动类
 */

@SpringBootApplication
@ServletComponentScan    //在Spring boot 启动时会扫描@WebServlet,@WebFilter,@WebListener注解，并将该类实例化
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
