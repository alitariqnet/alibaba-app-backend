package com.AlHassanElectronics.Software.controller;

import com.AlHassanElectronics.Software.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
}
