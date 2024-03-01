package com.ex1.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ex1.classwork.model.Person;
import java.util.List;


@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{

    List<Person> findByNameStartingWith(String name);
    List<Person> findByNameEndingWith(String name);
    
}
