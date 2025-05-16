package com.H2DBApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.H2DBApp.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
