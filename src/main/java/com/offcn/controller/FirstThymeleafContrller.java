package com.offcn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafContrller {
    @GetMapping("/first")
    public String indexPage(Model model){
        String message = "hello thymeleaf";
        model.addAttribute("message",message);
        return "index";

    }
}
