package com.day2_cw2.day2_cw2.controller;




import org.springframework.web.bind.annotation.RestController;

import com.day2_cw2.day2_cw2.model.PostModel;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostManController {
    @PostMapping("/post")
    public PostModel postMethodName(@RequestBody PostModel entity) {
      
        return entity;
    }
    
}