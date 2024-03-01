package com.ex2.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ex2.classwork.model.Course;
import java.util.List;


@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{

    List<Course> findByCourseName(String courseName);
    
}
