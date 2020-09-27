package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {
    @GetMapping("/second")
    public String indexPage(Model model){
        String message = "hello,thymeleaf";
        User user = new User();
        user.setId(1);
        user.setName("迪丽热巴");
        user.setAge(28);
        Map<String,Object> map = new HashMap<>();
        map.put("name","马尔扎哈");
        map.put("age",500);
        model.addAttribute("message",message);
        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index2";
    }
}
