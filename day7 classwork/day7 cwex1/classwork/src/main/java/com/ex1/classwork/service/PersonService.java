package com.ex1.classwork.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ex1.classwork.model.Person;
import com.ex1.classwork.repository.PersonRepo;

@Service
public class PersonService {
    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Person person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Person> getPersons() {
        return personRepo.findAll();
    }

    public List<Person> getPersonAge(int age) {
        return personRepo.findByAge(age);
    }
}
