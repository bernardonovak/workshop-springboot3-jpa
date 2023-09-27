package com.bernardonovak.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardonovak.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
