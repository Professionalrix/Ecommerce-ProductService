package com.ecommerce.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ecommerce.entity.Category;
import com.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/test")
	public String  test() {
	
		return "CategoryTest";
	}
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<Category>  getCategory(@PathVariable("categoryId")Long categoryId) {
		
		return ResponseEntity.ok().body(categoryService.getCategory(categoryId));
	}
	
	
	
	@PostMapping("/add")
	public ResponseEntity<Category> createCategory(@RequestBody Category category) {
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/categories/add").toString());
		return ResponseEntity.created(uri).body(categoryService.createCategory(category));
	}
	
	
}
