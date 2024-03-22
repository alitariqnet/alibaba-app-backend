package com.AlHassanElectronics.Software.service;


import org.springframework.stereotype.Service;

@Service(value = "alhassanservice")
public class AlHassanService {
    public String greetings(String name){
        return "Welcome to our shop `&{name}`";
    }
}
