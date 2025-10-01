package com.example.demo.respository;

import com.example.demo.dto.Student;
import com.example.demo.entity.StudentEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// --------------------- using jpa -----------------------

// this automatically provides basic db interaction methods 
public interface studentRepository extends JpaRepository<StudentEntity, Integer>{}

// -------------------------------------------------------




// --------------------- without jpa ---------------------
// here are manually making db interaction methods


// @Repository
// public class studentRepository {

//     ArrayList<Student> list = new ArrayList<>();

//     public List<Student> getAllStudents() {
        
//         Student s1 = new Student("shubham", "tech", 28);
//         Student s2 = new Student("ashish", "purchase", 28);
//         Student s3 = new Student("shiv", "analyst", 27);
//         Student s4 = new Student("rishab", "frontend", 26);

//         list.add(s1);
//         list.add(s2);
//         list.add(s3);
//         list.add(s4);

//         return list;

//     }

//     public void addStudent (Student student) {
//         list.add(student);
//     }

//     public void deleteStudentById (int id) {
//         // for(Student student : list) {
//         //     if(id == student.)
//         // }
//     }



// }
