package com.torryharris.ecommerce.service;

import java.util.List;

import com.torryharris.ecommerce.model.Category;

public interface CategoryService {
	
	List<Category> getAllCategory();
	Category getById(int catId);
	void insertCategory(Category category);
	void deleteCategory(Category category);
	void updateCategory(Category category);

}
