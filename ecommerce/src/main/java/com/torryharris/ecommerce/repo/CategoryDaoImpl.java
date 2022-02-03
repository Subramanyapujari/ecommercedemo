package com.torryharris.ecommerce.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.torryharris.ecommerce.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	
	JdbcTemplate jdbcTamplate;
	
	private final String SQL_DELETE_CATEGORY="delete from category where catId=?";
	
	@Autowired
	public CategoryDaoImpl(DataSource dataSource) {
		jdbcTamplate = new JdbcTemplate(dataSource);
	}
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Category> getAllCategory() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Category> cq = builder.createQuery(Category.class);
		Root<Category> root = cq.from(Category.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	public Category getById(int catId) {
		for(Category category:getAllCategory()) {
			if(category.getCatId()==catId) {
				return category;
			}
			
		}
		return null;
	}
	
	@Transactional
	public void insertCategory(Category category) {
		entityManager.persist(category);
		
	}
	
	@Transactional
	public void deleteCategory(Category category) {
		jdbcTamplate.update(SQL_DELETE_CATEGORY, category.getCatId()>0);
	}
	
	@Transactional
	public void updateCategory(Category category) {
		entityManager.merge(category);
	}

}
