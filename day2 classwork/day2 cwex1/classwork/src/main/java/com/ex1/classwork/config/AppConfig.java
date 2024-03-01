package com.ex1.classwork.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Value("${app.name}")
    public String studentName;
    
    @Value("${app.department}")
    public String studentDepartment;
    
    public String getstudentName() {
        return studentName;
    }
    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getstudentDepartment() {
        return studentDepartment;
    }
    public void setstudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    public AppConfig(String studentName, String studentDepartment) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }
}