package com.AlHassanElectronics.Software.controller;

import com.AlHassanElectronics.Software.entity.User;
import com.AlHassanElectronics.Software.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class UserControllerV2 {
    @Autowired
    private UserService userService;
    private int number = 10;
    @GetMapping("users")
    @ModelAttribute("users")
    public List<User> getUsersV2() {
        return userService.getUsers();
    }
}
