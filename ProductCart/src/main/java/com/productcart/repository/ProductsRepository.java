package com.productcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productcart.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
