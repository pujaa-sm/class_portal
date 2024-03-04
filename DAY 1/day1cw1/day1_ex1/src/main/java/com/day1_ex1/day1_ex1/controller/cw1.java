package com.day1_ex1.day1_ex1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class cw1 {
    @GetMapping("/helo")
    public String getMethodName() {
        return "WElcome hi";
    }
}