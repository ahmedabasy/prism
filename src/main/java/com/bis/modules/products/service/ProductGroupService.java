package com.bis.modules.products.service;

import java.util.List;
import com.bis.modules.products.model.ProductGroups;

public interface ProductGroupService {

	List<ProductGroups> getAllProductGroups();
	void save(ProductGroups productGroups);
	ProductGroups getProductGroupsById(Integer groupId);
	ProductGroups update(Integer groupId, ProductGroups productGroups);
	void delete(Integer groupId);
	
}