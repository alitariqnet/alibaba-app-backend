package com.AlHassanElectronics.Software.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "heroes")
@RequestMapping(name = "/api/heroes")
public class HeroesController {
    @GetMapping("/villains")
    public String greet(){
        return "Heroes are not welcome, villains are...";
    }
}
