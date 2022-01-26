package com.productcart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.productcart.entity.Category;
import com.productcart.entity.Products;

@Service
@Transactional
public interface ProductService {

	public List<Category> categoryDropdown();
	
	public void saveproduct(Category category, Products products);

	public List<Products> viewAllProducts();
	
}
