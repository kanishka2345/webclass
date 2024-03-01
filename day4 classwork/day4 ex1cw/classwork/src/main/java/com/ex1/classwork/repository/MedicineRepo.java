package com.ex1.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex1.classwork.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
    
}
