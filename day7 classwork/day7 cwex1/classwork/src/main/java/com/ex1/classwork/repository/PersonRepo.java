package com.ex1.classwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex1.classwork.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>
{
    List<Person> findByAge(int age);
}