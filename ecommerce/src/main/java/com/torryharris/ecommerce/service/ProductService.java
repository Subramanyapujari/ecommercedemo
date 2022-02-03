package com.torryharris.ecommerce.service;

import java.util.List;

import com.torryharris.ecommerce.model.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	Product getProductById(int productId);
	void insertProduct(Product product);
	void deleteProduct(Product product);
	void updateProduct(Product product);

}
