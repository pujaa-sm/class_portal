package com.day2_cw3.day2_cw3.controller;
import com.day2_cw3.day2_cw3.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/ignore")
    public Student st()
    {
        Student s=new Student(101, "karthi", "He is a boy");
        return s;
    }
    
}