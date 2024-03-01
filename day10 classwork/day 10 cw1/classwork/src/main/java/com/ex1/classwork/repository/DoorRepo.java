package com.ex1.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex1.classwork.model.Door;

public interface DoorRepo extends JpaRepository<Integer,Door> {

    
} 
