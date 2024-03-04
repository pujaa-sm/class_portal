package com.example.day8cw3.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8cw3.model.Student;
import com.example.day8cw3.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @SuppressWarnings("null")
    public boolean post(Student student)
    {
        try
        {
            studentRepo.save(student);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Student> getAll()
    {
        return studentRepo.findAll();
    }

    public List<Student> getGreater(int marks)
    {
        return studentRepo.findByMarksGreaterThan(marks);
    }

    public List<Student> getLesser(int marks)
    {
        return studentRepo.findByMarksLessThan(marks);
    }
    
}