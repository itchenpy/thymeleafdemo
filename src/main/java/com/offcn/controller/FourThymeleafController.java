package com.offcn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourThymeleafController {
    @GetMapping("/four")
    public String indexPage(Model model){
        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }
    @GetMapping("/five")
    public String indexPage5(Model model) {
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index5";
    }
}
