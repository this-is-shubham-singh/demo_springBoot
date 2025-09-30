package com.example.demo.respository;

import com.example.demo.dto.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class studentRepository {

    ArrayList<Student> list = new ArrayList<>();

    public List<Student> getAllStudents() {
        
        Student s1 = new Student("shubham", "tech", 28);
        Student s2 = new Student("ashish", "purchase", 28);
        Student s3 = new Student("shiv", "analyst", 27);
        Student s4 = new Student("rishab", "frontend", 26);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        return list;

    }

    public void addStudent (Student student) {
        list.add(student);
    }

    public void deleteStudentById (int id) {
        // for(Student student : list) {
        //     if(id == student.)
        // }
    }



}
