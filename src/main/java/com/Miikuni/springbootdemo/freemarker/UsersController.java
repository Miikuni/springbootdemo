package com.Miikuni.springbootdemo.freemarker;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * UsersController
 */
@Controller
public class UsersController {

    /**
     * 处理请求，返回数据
     */
    @GetMapping("/showUsers")
    public String showUsers(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users("admin","F","16"));
        list.add(new Users("Lisi","M","25"));
        list.add(new Users("xiaoli","F","18"));
        model.addAttribute("list",list);
        return "usersList"; //不用加扩展名
    }
}
