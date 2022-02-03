package com.torryharris.ecommerce.repo;

import java.util.List;

import com.torryharris.ecommerce.model.Product;

public interface ProductDao {
	
	List<Product> getAllProduct();
	Product getProductById(int productId);
	void insertProduct(Product product);
	void deleteProduct(Product product);
	void updateProduct(Product product);

}
