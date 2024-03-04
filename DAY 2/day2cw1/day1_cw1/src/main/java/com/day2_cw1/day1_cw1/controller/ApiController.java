package com.day2_cw1.day1_cw1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.day2_cw1.day1_cw1.config.AppConfig;
@RestController
public class ApiController {
    @Autowired
    private AppConfig ac;
    @GetMapping("/path")
    public AppConfig getAppDetails()
    {
        return ac;
    } 
    
}