package com.bis.modules.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bis.modules.products.dao.ProductsDao;
import com.bis.modules.products.model.Products;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDao productsDao;
	
	@Override
	public List<Products> getAllProducts() {
		return productsDao.getAllProducts();
	}

	@Override
	public void save(Products products) {
		productsDao.save(products);
	}

	@Override
	public Products getProductById(Integer id) {
		return productsDao.getProductById(id);
	}

	@Override
	public Products update(Integer id, Products products) {
		return productsDao.update(id, products);
	}

	@Override
	public void delete(Integer productId) {
		productsDao.delete(productId);
	}
}