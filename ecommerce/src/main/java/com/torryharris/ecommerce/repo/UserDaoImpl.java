package com.torryharris.ecommerce.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.torryharris.ecommerce.model.UserRegistration;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void insertUser(UserRegistration registration) {
		entityManager.persist(registration);
		
	}

}
