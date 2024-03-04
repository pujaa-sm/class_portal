package com.day1_ex2.day1_ex2.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cw2 {
    
    @RequestMapping("/studentName")
    public String studentName(@RequestParam String studentName) {
        return "Welcome "+ studentName +"!";
    }
    
}

