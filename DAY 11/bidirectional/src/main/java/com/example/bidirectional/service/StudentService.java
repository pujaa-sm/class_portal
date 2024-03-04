
package com.example.bidirectional.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirectional.model.Student;
import com.example.bidirectional.model.StudentInfo;
import com.example.bidirectional.repository.StudentInfoRepo;
import com.example.bidirectional.repository.StudentRepo;

@Service
public class StudentService {
    public StudentRepo studentRepository;
    public StudentInfoRepo studentInfoRepository;
    public StudentService(StudentRepo studentRepo,StudentInfoRepo studentInfoRepo)
    {
        this.studentRepo = studentRepo;
        this.studentInfoRepo = studentInfoRepo;
    }
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }
    public StudentInfo saveStudentInfo(StudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }
}