package com.ex2.classwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex2.classwork.model.Course;
import com.ex2.classwork.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    private CourseRepo rep;

    public boolean post(Course person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Course> getAll()
    {
        return rep.findAll();
    }

    public List<Course> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
