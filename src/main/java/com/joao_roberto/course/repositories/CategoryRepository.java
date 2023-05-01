package com.joao_roberto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao_roberto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
