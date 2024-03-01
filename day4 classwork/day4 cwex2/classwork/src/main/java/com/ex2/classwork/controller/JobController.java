package com.ex2.classwork.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.ex2.classwork.model.*;
import com.ex2.classwork.service.Jobservice;


import java.util.*;
@RestController
// @RequestMapping("/api")
public class JobController {

    
    private Jobservice ser;
    

    public JobController(Jobservice ser) {
        this.ser = ser;
    }


    @PostMapping("/job")
    public ResponseEntity<Job> postjob(@RequestBody Job job)
    {
        if(ser.addJob(job))
        {
            return new ResponseEntity<>(job, HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
        }
    }


    @GetMapping("/job")
    public ResponseEntity<List<Job>> getJob()
    {
        List<Job> jb = ser.getAll();
        if(jb.size() > 0)
        {
            return new ResponseEntity<List<Job>>(jb, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


     @GetMapping("/job/{jobId}")
    public ResponseEntity<Optional<Job>> findJ(@PathVariable int jobId)
    {
        Optional<Job> jo = ser.findById(jobId);

        if(!jo.isEmpty())
        {
            return new ResponseEntity<Optional<Job>>(jo, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }   
    
}