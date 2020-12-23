package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"channelName"})
public class HomeResource {
    @RequestMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("channelName", "Rinaldi");
        return "dashboard";
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403_error";
    }
}
