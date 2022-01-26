package com.productcart.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "category", uniqueConstraints = {
		@UniqueConstraint(columnNames = "categoryname")})
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id", length = 4)
	private int category_id;
	
	@Column(name = "categoryname", unique = true, nullable = false, length = 30)
	private String categoryname;
	
	@OneToMany(mappedBy = "category")
    private Set<Products> products;
	
	/*
	 * public Category() { }
	 * 
	 * public Category(String categoryname) { super(); this.categoryname =
	 * categoryname; }
	 */

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	

}
