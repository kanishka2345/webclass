package com.ex3.classwork.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ex3.classwork.model.Student;

@RestController
public class StudentController 
{
    @GetMapping("/student")
    public Student getMethodName()
    {
        Student students=new Student( 1L, "John Doe", "This is a student description.");
        return students;
    }
}