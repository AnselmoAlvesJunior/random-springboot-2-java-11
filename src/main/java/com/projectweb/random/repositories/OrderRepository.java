package com.projectweb.random.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectweb.random.entities.Order;


public interface OrderRepository extends JpaRepository<Order,Long> {
	
	
}
