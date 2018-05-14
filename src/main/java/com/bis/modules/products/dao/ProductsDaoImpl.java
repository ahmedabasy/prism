package com.bis.modules.products.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bis.modules.products.model.Products;

@Repository
public class ProductsDaoImpl implements ProductsDao{

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Products> getAllProducts() {
		return entityManager.createQuery("From Products").getResultList();
	}
	
	@Override
	public void save(Products products) {
		entityManager.persist(products);
	}

	@Override
	public Products getProductById(Integer id) {
		return entityManager.find(Products.class, id);
	}

	@Override
	public Products update(Integer id, Products product) {
		product = new Products();
		product.setProductId(id);
		return entityManager.merge(product);
	}

	@Override
	public void delete(Integer productId) {
		Products product = entityManager.find(Products.class, productId);
		if(entityManager.contains(product))
			entityManager.remove(product);
		else
			entityManager.remove(entityManager.merge(product));
	}
}