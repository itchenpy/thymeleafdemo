package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {
    @GetMapping("/three")
    public String indexPage(Model model){
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("迪丽热巴");
        user1.setAge(12);
        User user2 = new User();
        user2.setId(2);
        user2.setName("古力娜扎");
        user2.setAge(13);
        User user3= new User();
        user3.setId(3);
        user3.setName("马尔扎哈");
        user3.setAge(14);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("userlist",list);
        return "index3";
    }
}
