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
import com.bis.modules.products.model.ProductGroups;
import com.bis.modules.products.service.ProductGroupService;

@Controller
public class ProductGroupsController {

//	@Autowired
//	private ProductGroupService productGroupService;
//	
//	@GetMapping("productGroups")
//	public ResponseEntity<List<ProductGroups>> getAllProductGroups(){
//		List<ProductGroups> productGroupsList = productGroupService.getAllProductGroups();
//		return new ResponseEntity<List<ProductGroups>>(productGroupsList, HttpStatus.OK);
//	}
//	
//	@PostMapping("addProductGroup") // still working on add error
//	public void addProductGroup(@RequestBody ProductGroups productGroups) {
//		productGroupService.save(productGroups);
//	}
//	
//	@GetMapping("productGroup/{groupId}")
//	public ResponseEntity<ProductGroups> getProductGroupById(@PathVariable(value = "id") Integer id){
//		ProductGroups productGroups = productGroupService.getProductGroupsById(id);
//		return new ResponseEntity<ProductGroups>(productGroups, HttpStatus.OK);
//	}
//	
//	@PutMapping("productGroup/{groupId}") // still working on udpate error
//	public ResponseEntity<ProductGroups> updateProduct(@PathVariable(value = "id") Integer id , @RequestBody ProductGroups productGroups) {
//		ProductGroups updatedProductGroup = productGroupService.update(id, productGroups);
//		return new ResponseEntity<ProductGroups>(updatedProductGroup, HttpStatus.OK);
//	}
//	
//	@DeleteMapping("productGroup/{groupId}")
//	public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Integer id) {
//		productGroupService.delete(id);
//		return ResponseEntity.ok().body("Deleted Product Group Successfully");
//	}
}