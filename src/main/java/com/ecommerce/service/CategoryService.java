package com.ecommerce.service;

import com.ecommerce.entity.Category;

public interface CategoryService {

	public Category createCategory(Category category);
	public Category getCategory(Long categoryId);
	
}
