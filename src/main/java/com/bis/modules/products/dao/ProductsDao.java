package com.bis.modules.products.dao;

import java.util.List;
import com.bis.modules.products.model.Products;

public interface ProductsDao {

	List<Products> getAllProducts();
	void save(Products products);
	Products getProductById(Integer id);
	Products update(Integer id, Products products);
	void delete(Integer productId);
}