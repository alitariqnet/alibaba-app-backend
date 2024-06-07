package com.AlHassanElectronics.Software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping("/")
    public String handle(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }
}
