package com.Miikuni.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    //回到静态资源static中寻找对应资源
    @RequestMapping("/page")
    public String showPage() {
        return "index.html";
    }
}
