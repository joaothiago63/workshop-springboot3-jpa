package com.joao_roberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao_roberto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
