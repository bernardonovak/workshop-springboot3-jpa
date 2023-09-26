package com.bernardonovak.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bernardonovak.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
