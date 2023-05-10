package com.joao_roberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao_roberto.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
