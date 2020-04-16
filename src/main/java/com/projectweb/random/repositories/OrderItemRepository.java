package com.projectweb.random.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectweb.random.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
	
	
}
