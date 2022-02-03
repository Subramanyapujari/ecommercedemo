package com.torryharris.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.ecommerce.model.Category;
import com.torryharris.ecommerce.repo.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;

	public List<Category> getAllCategory() {
		return categoryDao.getAllCategory();
	}

	public Category getById(int catId) {
		return categoryDao.getById(catId);
	}

	public void insertCategory(Category category) {
		categoryDao.insertCategory(category);
		
	}

	public void deleteCategory(Category category) {
		categoryDao.deleteCategory(category);
		
	}

	public void updateCategory(Category category) {
		categoryDao.updateCategory(category);
		
	}

}
