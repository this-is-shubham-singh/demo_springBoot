package com.example.demo.service;

import com.example.demo.respository.studentRepository;
import com.example.demo.dto.Student;
import com.example.demo.entity.StudentEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    private studentRepository studentRepo;

    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addStudent (StudentEntity student) {
        studentRepo.save(student);
    }

    public void deleteStudent (int id) {
        studentRepo.deleteById(id);
    }

    public void updateStudent(int id, StudentEntity student) {
        StudentEntity existingStudent = studentRepo.findById(id).orElseThrow();

        existingStudent.setCourse(student.getName());
        existingStudent.setCourse(student.getCourse());

        studentRepo.save(existingStudent);
    }
}
