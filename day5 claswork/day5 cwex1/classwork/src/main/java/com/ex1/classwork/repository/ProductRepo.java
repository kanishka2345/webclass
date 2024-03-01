package com.ex1.classwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex1.classwork.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}