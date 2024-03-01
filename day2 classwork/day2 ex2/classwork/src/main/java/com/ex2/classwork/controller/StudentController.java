package com.ex2.classwork.controller;


    


import com.ex2.classwork.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/students")
    public String createStudent(@RequestBody Student student) {
        return "Student created: " + student.getName() + ", Age: " + student.getAge();
    }
}

