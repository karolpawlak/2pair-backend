package com.projectx.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.application.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}