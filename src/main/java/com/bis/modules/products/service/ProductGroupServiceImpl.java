package com.bis.modules.products.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bis.modules.products.dao.ProductGroupDao;
import com.bis.modules.products.model.ProductGroups;

@Service
@Transactional
public class ProductGroupServiceImpl implements ProductGroupDao {

	@Autowired
	private ProductGroupDao productGroupDao;
	
	@Override
	public List<ProductGroups> getAllProductGroups() {
		return productGroupDao.getAllProductGroups();
	}

	@Override
	public void save(ProductGroups productGroups) {
		productGroupDao.save(productGroups);
	}

	@Override
	public ProductGroups getProductGroupsById(Integer groupId) {
		return productGroupDao.getProductGroupsById(groupId);
	}

	@Override
	public ProductGroups update(Integer groupId, ProductGroups productGroups) {
		return productGroupDao.update(groupId, productGroups);
	}

	@Override
	public void delete(Integer groupId) {
		productGroupDao.delete(groupId);
	}
}