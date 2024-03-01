package com.ex2.classwork.repository;

import com.ex2.classwork.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<Job, Integer> {

}

