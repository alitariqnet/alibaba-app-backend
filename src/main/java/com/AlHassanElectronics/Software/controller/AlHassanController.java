package com.AlHassanElectronics.Software.controller;

import com.AlHassanElectronics.Software.service.AlHassanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class AlHassanController {
    @Autowired
    private AlHassanService alHassanService;

    @GetMapping("greetings")
    @ResponseBody
    public ResponseEntity<String> greetings(@RequestParam String name){
        log.info("Entering greetings method...");
        return new ResponseEntity<String>(alHassanService.greetings(name), HttpStatus.OK);
    }
}
