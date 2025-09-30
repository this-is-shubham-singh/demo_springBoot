package com.example.demo.controller;

import java.util.List;
import com.example.demo.dto.Student;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private studentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();

    }

    @PostMapping("/createStudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PostMapping("/deleteStudentById")
    public void deleteStudentById(@RequestBody int id) {
        
    }

    public void updateStudent () {
        
    }

}
