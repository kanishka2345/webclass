package com.ex4.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex4.classwork.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{

    
  
}
