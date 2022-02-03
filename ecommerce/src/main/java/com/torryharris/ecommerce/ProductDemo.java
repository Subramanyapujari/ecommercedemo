package com.torryharris.ecommerce;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.ecommerce.config.DataBaseConfig;
import com.torryharris.ecommerce.model.Product;
import com.torryharris.ecommerce.service.ProductService;

public class ProductDemo {

	public static void main(String[] args) {
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
//		
//		ProductService productService = context.getBean(ProductService.class);
//		
//		Product product = new Product(0, "Boonze", "decoration with medicinal", 1000, 5, 2, 1);
//		Product product1 = new Product(0, "Booming", "medicinal", 1500, 5, 2, 1);
//		
//		ArrayList<Product> list = new ArrayList<Product>();
//		list.add(product);
//		list.add(product1);
//		
//		for(Product p:list) {
//			productService.insertProduct(p);
//		}
//		
//		for(Product product2:productService.getAllProduct()) {
//			System.out.println(product2);
//		}

	}

}
