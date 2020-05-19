package com.Miikuni.springbootdemo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 页面跳转controller
 */
@Controller
public class ThymeleafController {
    /**
     * 页面跳转方法
     */
    @GetMapping("/show")
    public String showPage(Model model, HttpServletRequest request) {
        model.addAttribute("msg", "Thymeleaf 第一个案例");
        model.addAttribute("date", new Date());
        model.addAttribute("sex", "女");
        model.addAttribute("id", 1);
        List<User> userList = new ArrayList<>();
        userList.add(new User("1", "qiangge", 22));
        userList.add(new User("2", "khan", 18));
        userList.add(new User("3", "faker", 25));
        userList.add(new User("4", "uzi", 33));
        model.addAttribute("userList", userList);

        Map<String, User> map = new HashMap<>();
        map.put("user1", new User("1", "qiangge", 22));
        map.put("user2", new User("2", "khan", 18));
        map.put("user3", new User("3", "faker", 25));
        map.put("user4", new User("4", "uzi", 33));
        model.addAttribute("map", map);

        request.setAttribute("req", "HttpServletRequest");
        request.getSession().setAttribute("sess", "HttpSession");
        request.getSession().getServletContext().setAttribute("app", "application");
        model.addAttribute("id", "100");
        model.addAttribute("name", "faker");
        return "indexThymeleaf";
    }

    @GetMapping("/show2")
    public String show2(String id, String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }

    @GetMapping("/show3/{id}/{name}")
    public String show3(@PathVariable String id, @PathVariable String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }

    @GetMapping("/show4/{id}")
    public String show4(@PathVariable String id, String name) {
        System.out.println(id + "\t" + name);
        return "index2";
    }
}
