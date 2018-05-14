package com.bis.modules.products.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bis.modules.products.model.ProductPic;

@Repository
public class ProductPicDaoImpl implements ProductPicDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductPic> getAllProductPics() {
		return entityManager.createQuery("From ProductPic").getResultList();
	}

	@Override
	public void save(ProductPic productPic) {
		entityManager.persist(productPic);
	}

	@Override
	public ProductPic getProductPicById(Integer picId) {
		return entityManager.find(ProductPic.class, picId);
	}

	@Override
	public ProductPic update(Integer picId, ProductPic productPic) {
		productPic = new ProductPic();
		productPic.setPicId(picId);
		return entityManager.merge(productPic);
	}

	@Override
	public void delete(Integer picId) {
		ProductPic productPic = entityManager.find(ProductPic.class, picId);
		if(entityManager.contains(productPic))
			entityManager.remove(productPic);
		else
			entityManager.remove(entityManager.merge(productPic));
	}
}