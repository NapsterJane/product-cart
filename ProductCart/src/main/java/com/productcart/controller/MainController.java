package com.productcart.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.productcart.entity.Category;
import com.productcart.entity.Products;
import com.productcart.service.ProductService;

@Controller
public class MainController {
	
	@Autowired
	ProductService productservice;
	
	@RequestMapping (value = { "/", "/home" }, method = RequestMethod.GET)
	public String home() {
		
		return "welcome";
	}
	
	@GetMapping(value = "newproduct")
	public String createNewProduct(Model model) {
		List<Category> categories = productservice.categoryDropdown();	
		model.addAttribute("categories", categories);
		return "newproduct";
	}
	
	@GetMapping(value = "viewproductsbycategory")
	public String viewByCategory(Model model) {
		List<Category> categories = productservice.categoryDropdown();	
		model.addAttribute("categories", categories);
		return "viewbycategory";
	}
	
	@GetMapping(value = "viewall")
	public String viewAllDetailed(Model model) {
			List<Products> products = productservice.viewAllProducts();
			model.addAttribute("product", products);
		return "viewall";
	}
	
	@PostMapping(value = "saveproduct")
	public String saveProd(Model model, HttpServletRequest req/* @RequestParam("category") String cat , @ModelAttribute("products") Products products */) {
		Category category =  new Category();
		category.setCategoryname(req.getParameter("category"));
		
		Products products = new Products();
		products.setPcode(req.getParameter("pcode"));
		products.setPname(req.getParameter("pname"));
		products.setStatus(req.getParameter("status"));
		products.setPdescription(req.getParameter("pdescription"));
		products.setPrice(Integer.parseInt(req.getParameter("price")));
//		Set<Products> product = new HashSet<>();
//		product.add(products);
		//category.setProducts(product);
		
		productservice.saveproduct(category, products);
		
		List<Products> products1 = productservice.viewAllProducts();
		model.addAttribute("product", products1);
		
		return "viewall";
	}
	
	@PostMapping(value = "/viewbycate")
	public String view(Model model) {
		return "viewall";
	}
	
}
