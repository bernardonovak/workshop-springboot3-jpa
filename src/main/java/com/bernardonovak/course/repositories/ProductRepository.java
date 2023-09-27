package com.bernardonovak.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardonovak.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
