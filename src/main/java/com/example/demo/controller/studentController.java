package com.example.demo.controller;

import java.util.List;
import com.example.demo.dto.Student;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private studentService studentService;

    @GetMapping("/getStudents")
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/createStudent")
    public void addStudent(@RequestBody StudentEntity student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("updateStudentById/{id}")
    public void updateStudent (@PathVariable int id, @RequestBody StudentEntity student) {
        studentService.updateStudent(id, student);
    }

}
