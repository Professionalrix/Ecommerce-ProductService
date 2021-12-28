package com.ecommerce.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ecommerce.entity.Category;
import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/test1")
	public String goHome() {
		return "home";
	}
	
	@GetMapping("")
	public ResponseEntity<List<Product>> getUsers(){
		return ResponseEntity.ok().body(productService.getProducts()); 
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> createCategory(@RequestBody Product product) {
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/products/add").toString());
		return ResponseEntity.created(uri).body(productService.createProduct(product));
	}
	
	
}
