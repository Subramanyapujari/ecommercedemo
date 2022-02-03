package com.torryharris.ecommerce;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.ecommerce.config.DataBaseConfig;
import com.torryharris.ecommerce.model.Category;
import com.torryharris.ecommerce.service.CategoryService;
import com.torryharris.ecommerce.service.ProductService;

public class ecommerceDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
		
		//CategoryService categoryService = context.getBean(CategoryService.class);
		
		
		//Category category = new Category(0, "medicine","medicine plants");
//		Category c1 = new Category(0, "flower", "decorations");
//		
//		ArrayList<Category> list = new ArrayList<Category>();
//		list.add(c1);
//		
//		for(Category c:list) {
//			categoryService.insertCategory(c);
//		}
		
//		for(Category category:categoryService.getAllCategory()) {
//			System.out.println(category);
//		}
		
//		Category category1 = categoryService.getById(2);
//		//categoryService.deleteCategory(category1);
//		category1.setCatName("medicine");
//		categoryService.updateCategory(category1);
//		
//		for(Category category:categoryService.getAllCategory()) {
//			System.out.println(category);
//		}
		
	}

}
