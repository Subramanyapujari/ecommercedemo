package com.torryharris.ecommerce.repo;

import java.util.List;

import com.torryharris.ecommerce.model.Category;

public interface CategoryDao {
	List<Category> getAllCategory();
	Category getById(int catId);
	void insertCategory(Category category);
	void deleteCategory(Category category);
	void updateCategory(Category category);
}
