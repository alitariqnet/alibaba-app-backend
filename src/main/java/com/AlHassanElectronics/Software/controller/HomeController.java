package com.AlHassanElectronics.Software.controller;

import com.AlHassanElectronics.Software.facade.IGTVGController;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import java.util.logging.Logger;

@Controller
@RequestMapping("/api/home")
public class HomeController implements IGTVGController {

    private final Logger log = java.util.logging.Logger.getLogger("Homecontroller");
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext, ITemplateEngine templateEngine) {
        log.info("inside process method");
    }
}
