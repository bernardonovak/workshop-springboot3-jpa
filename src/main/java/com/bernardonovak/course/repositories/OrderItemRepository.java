package com.bernardonovak.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardonovak.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
