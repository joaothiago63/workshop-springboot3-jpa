package com.joao_roberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao_roberto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
