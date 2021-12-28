package com.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Category;
import com.ecommerce.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired 
	private CategoryRepository categoryRepository;
	
	
	@Override
	public Category createCategory(Category category) {
		
		return categoryRepository.save(category);
	}

	@Override
	public Category getCategory(Long categoryId) {
		Optional<Category> findById = categoryRepository.findById(categoryId);
		return findById.get();
	}

}
