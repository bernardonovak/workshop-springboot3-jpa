package com.bernardonovak.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bernardonovak.course.entities.Order;
import com.bernardonovak.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public Order findById(Long Id) {
		return repository.findById(Id).get();
	}
	
	public List<Order> findAll(){
		return repository.findAll();
	}
}
