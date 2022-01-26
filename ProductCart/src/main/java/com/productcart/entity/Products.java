package com.productcart.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
	@GeneratedValue
	@Column(name = "Product_id")
	private int Product_id;
	
	@Column(name = "pcode")
	private String pcode;
	
	@Column(name = "pname")
	private String pname;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "pdescription")
	private String pdescription;
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
	
//	public Products() {
//		super();
//	}


	public int getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}


//	public Products(String pcode, String pname, int price, String status, String pdescription, Category category) {
//		super();
//		this.pcode = pcode;
//		this.pname = pname;
//		this.price = price;
//		this.status = status;
//		this.pdescription = pdescription;
//		this.category = category;
//	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
