package com.ex3.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex3.classwork.model.Language;

public interface LanguageRepo extends JpaRepository<Language, Integer> {
    
}