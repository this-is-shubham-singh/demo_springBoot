package com.example.demo.dto;

public class Student {

    private String name;
    private String course;
    private int age;

    public Student(String name, String course, int age) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }
}
