package com.ex2.classwork.service;

import com.ex2.classwork.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Optional; 

import com.ex2.classwork.repository.JobRepo;

@Service
public class Jobservice {

    @Autowired
    private JobRepo rep;
    
    public boolean addJob(Job job) {
        try {    
            rep.save(job);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Job> getAll() {
        return rep.findAll();
    }

    public Optional<Job> findById(int id) {
        return rep.findById(id);
    }
}
