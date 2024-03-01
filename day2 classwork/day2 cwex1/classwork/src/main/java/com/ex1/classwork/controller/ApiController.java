package com.ex1.classwork.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex1.classwork.config.AppConfig;

@RestController
public class ApiController {
   //@Value("${app.Name}")
    //public String appName;
    
   // @Value("${app.Version}")
   // public String appVersion;
   @Autowired
   AppConfig appconfig;
    @GetMapping("/info")
    public String getMethodName()
    {
        return("Student Name: "+appconfig.studentName +"Department:"+appconfig.studentDepartment);
    }

    
}