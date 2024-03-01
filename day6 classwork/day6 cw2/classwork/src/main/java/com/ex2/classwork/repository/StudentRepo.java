package com.ex2.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex2.classwork.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
