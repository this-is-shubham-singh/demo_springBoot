package com.example.demo.service;

import com.example.demo.respository.studentRepository;
import com.example.demo.dto.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    private studentRepository studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.getAllStudents();
    }

    public void addStudent (Student student) {
        studentRepo.addStudent(student);
    }

}
