package com.productcart.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcart.entity.Category;
import com.productcart.entity.Products;
import com.productcart.repository.CategoryRepository;
import com.productcart.repository.ProductsRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductsRepository productrepository;

	public void saveproduct(Category category, Products products) {
		try {
		category = categoryRepository.save(category);
		
		products.setCategory(category);
		
		productrepository.save(products);
		//System.out.println(category2);
		}catch (Exception e) {
			
			//RollBack
		}
	}

	public List<Category> categoryDropdown() {
		List<Category> categories = new ArrayList<>();
		for(Category category : categoryRepository.findAll()) {
			categories.add(category);
		}
		return categories;
	}

	public List<Products> viewAllProducts() {
		List <Products> products = new ArrayList<Products>(); 
		for(Products product : productrepository.findAll()) {
			//Category category = categoryRepository.findById(product.getCategory().getCategory_id());
			products.add(product);
		}
		
		return products;
	}

}
