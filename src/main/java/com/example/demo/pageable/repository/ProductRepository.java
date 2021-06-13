package com.example.demo.pageable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pageable.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
