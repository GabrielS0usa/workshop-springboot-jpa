package com.gsweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsweb.course.entities.Order;
import com.gsweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findbyId(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
