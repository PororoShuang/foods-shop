package com.foodshop.foodsshop.repository;

import com.foodshop.foodsshop.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}