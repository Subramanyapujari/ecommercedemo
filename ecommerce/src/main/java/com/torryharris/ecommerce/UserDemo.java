package com.torryharris.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.ecommerce.config.DataBaseConfig;
import com.torryharris.ecommerce.model.UserRegistration;
import com.torryharris.ecommerce.service.UserService;

public class UserDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
		
		UserService userService = context.getBean(UserService.class);
		
		UserRegistration registration = new UserRegistration("subramanya", "pujari","annappa", "subbu","subbu@gmail.com", "subbu@97");
		
		userService.insertUser(registration);
		
		
		
	}

}
