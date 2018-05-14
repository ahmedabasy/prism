package com.bis.modules.products.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bis.modules.products.model.ProductPic;
import com.bis.modules.products.service.ProductPicService;

@Controller
public class ProductPicController {

	@Autowired
	private ProductPicService productPicService;
	
	@GetMapping("productPics")
	public ResponseEntity<List<ProductPic>> getAllProductPics(){
		List<ProductPic> productPicsList = productPicService.getAllProductPics();
		return new ResponseEntity<List<ProductPic>>(productPicsList, HttpStatus.OK);
	}
	
	@PostMapping("addProductPic") // still working on add error
	public void addProductPic(@RequestBody ProductPic productPic) {
		productPicService.save(productPic);
	}
	
	@GetMapping("productPic/{picId}")
	public ResponseEntity<ProductPic> getProductsById(@PathVariable(value = "id") Integer id){
		ProductPic productPic = productPicService.getProductPicById(id);
		return new ResponseEntity<ProductPic>(productPic, HttpStatus.OK);
	}
	
	@PutMapping("productPic/{picId}") // still working on udpate error
	public ResponseEntity<ProductPic> updateProductPic(@PathVariable(value = "id") Integer id , @RequestBody ProductPic productPic) {
		ProductPic updatedProductPic = productPicService.update(id, productPic);
		return new ResponseEntity<ProductPic>(updatedProductPic, HttpStatus.OK);
	}
	
	@DeleteMapping("productPic/{picId}")
	public ResponseEntity<?> deleteProductPic(@PathVariable(value = "id") Integer id) {
		productPicService.delete(id);
		return ResponseEntity.ok().body("Deleted Pic Successfully");
	}
}