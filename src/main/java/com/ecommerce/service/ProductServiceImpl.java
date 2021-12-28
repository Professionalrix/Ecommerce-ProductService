package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private  ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product getProduct(Long productId) {
			
		return productRepository.findById(productId).get();
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

}
