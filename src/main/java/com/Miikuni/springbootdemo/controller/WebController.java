package com.Miikuni.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 页面跳转Controller
 */
@Controller
public class WebController {
    /**
     * 页面跳转
     */
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
