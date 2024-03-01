package com.ex3.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex3.classwork.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}