package com.torryharris.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.ecommerce.model.UserRegistration;
import com.torryharris.ecommerce.repo.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public void insertUser(UserRegistration registration) {
		
		userDao.insertUser(registration);
		
	}

}
