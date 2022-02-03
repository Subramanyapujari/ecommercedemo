package com.torryharris.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.ecommerce.model.Product;
import com.torryharris.ecommerce.repo.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}

	public Product getProductById(int productId) {
		return productDao.getProductById(productId);
	}

	public void insertProduct(Product product) {
		productDao.insertProduct(product);
		
	}

	public void deleteProduct(Product product) {
		productDao.deleteProduct(product);
		
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}

}
