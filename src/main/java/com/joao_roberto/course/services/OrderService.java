package com.joao_roberto.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao_roberto.course.entities.Order;
import com.joao_roberto.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		List<Order> list = orderRepository.findAll();
		return list;
	}

	public Order findById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);

		return obj.get();

	}

}
