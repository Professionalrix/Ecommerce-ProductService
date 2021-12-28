package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Product;

public interface ProductService {

	public Product createProduct (Product product);
	public Product getProduct(Long productId);
	public List<Product> getProducts();
}
