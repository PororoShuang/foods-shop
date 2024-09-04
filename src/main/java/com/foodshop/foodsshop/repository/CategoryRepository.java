package com.foodshop.foodsshop.repository;

import com.foodshop.foodsshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Category findByName(String name);
  
  boolean existsByName(String name);
}