package com.bis.modules.products.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bis.modules.products.dao.ProductPicDao;
import com.bis.modules.products.model.ProductPic;

@Service
@Transactional
public class ProductPicServiceImpl implements ProductPicService {

	@Autowired
	private ProductPicDao productPicDao;
	
	@Override
	public List<ProductPic> getAllProductPics() {
		return productPicDao.getAllProductPics();
	}

	@Override
	public void save(ProductPic productPic) {
		productPicDao.save(productPic);
	}

	@Override
	public ProductPic getProductPicById(Integer picId) {
		return productPicDao.getProductPicById(picId);
	}

	@Override
	public ProductPic update(Integer picId, ProductPic productPic) {
		return productPicDao.update(picId, productPic);
	}

	@Override
	public void delete(Integer picId) {
		productPicDao.delete(picId);
	}

}
