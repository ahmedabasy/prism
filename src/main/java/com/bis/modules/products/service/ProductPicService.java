package com.bis.modules.products.service;

import java.util.List;

import com.bis.modules.products.model.ProductPic;

public interface ProductPicService {
	
	List<ProductPic> getAllProductPics();
	void save(ProductPic productPic);
	ProductPic getProductPicById(Integer picId);
	ProductPic update(Integer picId, ProductPic productPic);
	void delete(Integer picId);
}