package com.AlHassanElectronics.Software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/login")
public class LoginController {
    @GetMapping("/greet")
    public String greet(){
        return "Greetings!";
    }
}
