package com.Miikuni.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理请求Controller
 */

@RestController  //@Controller+@ResponseBody：ResponseBody直接返回的数据格式是json（不做页面的跳转）
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWord(){
        return "HelloWorld";
    }
}
