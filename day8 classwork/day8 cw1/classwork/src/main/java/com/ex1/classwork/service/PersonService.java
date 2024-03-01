package com.ex1.classwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex1.classwork.model.Person;
import com.ex1.classwork.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo rep;

    public boolean post(Person person)
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

    public List<Person> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<Person> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
