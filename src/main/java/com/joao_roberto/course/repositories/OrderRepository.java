package com.joao_roberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao_roberto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
