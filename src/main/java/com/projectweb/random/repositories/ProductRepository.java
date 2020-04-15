package com.projectweb.random.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectweb.random.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
