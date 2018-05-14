package com.bis.modules.products.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.bis.modules.products.model.ProductGroups;

@Repository
public class ProductGroupDaoImpl implements ProductGroupDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductGroups> getAllProductGroups() {
		return entityManager.createQuery("FROM ProductGroups").getResultList();
	}

	@Override
	public void save(ProductGroups productGroups) {
		entityManager.persist(productGroups);
	}

	@Override
	public ProductGroups getProductGroupsById(Integer groupId) {
		return entityManager.find(ProductGroups.class, groupId);
	}

	@Override
	public ProductGroups update(Integer groupId, ProductGroups productGroups) {
		productGroups = new ProductGroups();
		productGroups.setGroupId(groupId);
		return entityManager.merge(productGroups);
	}

	@Override
	public void delete(Integer groupId) {
		ProductGroups productGroups = entityManager.find(ProductGroups.class, groupId);
		if(entityManager.contains(productGroups))
			entityManager.remove(productGroups);
		else
			entityManager.remove(entityManager.merge(productGroups));
	}
}