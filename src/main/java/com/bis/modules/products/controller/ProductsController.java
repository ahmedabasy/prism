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
import com.bis.modules.products.model.Products;
import com.bis.modules.products.service.ProductsService;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductsService productService;
	
//	@GetMapping(name = "products")
//	public String getAllProducts(Model model){
////		List<Products> productsList = (List<Products>) productsDao.findAll();
//		model.addAttribute("Products", productsDao.findAll());
//		return "products";
//	}
	
	@GetMapping("products")
	public ResponseEntity<List<Products>> getAllProducts(){
		List<Products> productsList = productService.getAllProducts();
		return new ResponseEntity<List<Products>>(productsList, HttpStatus.OK);
	}
	
	@PostMapping("addProduct") // still working on add error
	public void addProduct(@RequestBody Products products) {
		productService.save(products);
	}
	
	@GetMapping("product/{id}")
	public ResponseEntity<Products> getProductsById(@PathVariable(value = "id") Integer id){
		Products product = productService.getProductById(id);
		return new ResponseEntity<Products>(product, HttpStatus.OK);
	}
	
	@PutMapping("product/{id}") // still working on udpate error
	public ResponseEntity<Products> updateProduct(@PathVariable(value = "id") Integer id , @RequestBody Products product) {
		Products updatedProduct = productService.update(id, product);
		return new ResponseEntity<Products>(updatedProduct, HttpStatus.OK);
	}
	
	@DeleteMapping("product/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Integer id) {
		productService.delete(id);
		return ResponseEntity.ok().body("Deleted Successfully");
	}
	
}