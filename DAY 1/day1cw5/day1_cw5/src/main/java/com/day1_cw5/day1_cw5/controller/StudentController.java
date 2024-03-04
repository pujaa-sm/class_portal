package com.day1_cw5.day1_cw5.controller;




import org.springframework.web.bind.annotation.RestController;

import com.day1_cw5.day1_cw5.model.student;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/student")
    public List<student> getStudent() {
        List<student>studentList=new ArrayList<student>();
        student a=new student("John","WelcomeJohn");
        studentList.add(a);
        return studentList;
    }
}