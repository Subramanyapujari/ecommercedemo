package com.torryharris.ecommerce.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.torryharris.ecommerce.model.Category;
import com.torryharris.ecommerce.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	JdbcTemplate jdbcTamplate;
	
	private final String SQL_DELETE_PRODUCT="delete from product where productId=?";
	
	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jdbcTamplate = new JdbcTemplate(dataSource);
	}
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<Product> getAllProduct() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Product> cq = builder.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	public Product getProductById(int productId) {
		for(Product product:getAllProduct()) {
			if(product.getProductId()==productId) {
				return product;
			}
			
		}
		return null;
	}
	
	@Transactional
	public void insertProduct(Product product) {
		entityManager.persist(product);
		
	}
	
	@Transactional
	public void deleteProduct(Product product) {
		jdbcTamplate.update(SQL_DELETE_PRODUCT, product.getProductId()>0);
		
	}
	
	@Transactional
	public void updateProduct(Product product) {
		entityManager.merge(product);
		
	}

}
