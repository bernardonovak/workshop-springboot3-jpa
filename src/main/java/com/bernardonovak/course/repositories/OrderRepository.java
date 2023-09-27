package com.bernardonovak.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardonovak.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
