package com.day1_ex3.day1_ex3.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class cw3 {
    @GetMapping("/favouriteColor")
    public String requestMethodName( String color) {
        return "My favourite color is"+color+"!";
    }
   
    
}
