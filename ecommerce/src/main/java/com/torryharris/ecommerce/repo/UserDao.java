package com.torryharris.ecommerce.repo;

import com.torryharris.ecommerce.model.UserRegistration;

public interface UserDao {
	
	void insertUser(UserRegistration registration);

}
