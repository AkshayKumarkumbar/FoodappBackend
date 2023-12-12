package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.config.ResponseStructure;
import com.ty.springBoot_FoodApp.dao.ProductDao;
import com.ty.springBoot_FoodApp.dto.Product;
import com.ty.springBoot_FoodApp.dto.User;


@Service
public class ProductService {

	@Autowired
	private ProductDao productdao;
	
	public ResponseStructure<Product> saveProduct(Product product) {
		ResponseStructure<Product> responseStructure=new ResponseStructure<>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("product successfully saved");
		responseStructure.setData(productdao.saveProduct(product));
		return responseStructure;
		
	}
	public ResponseStructure<Product> updateProduct(int id,Product product) {
		ResponseStructure<Product> responseStructure=new ResponseStructure<>();
		Product product2=productdao.updateProduct(id, product);
		if(product2!=null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("product successfully updated");
			responseStructure.setData(product);
			return responseStructure;
			
		}else {
			return null;
		}
	}

	public ResponseStructure<Product> deleteProduct(int id ) {
		Product product=productdao.deleteProduct(id);
		ResponseStructure<Product> responseStructure=new ResponseStructure<>();
		if(product!=null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("product successfully deleted");
			responseStructure.setData(product);
			return responseStructure;
			
		}else {
			return null;
		}
	}
	public ResponseStructure<Product> getProductById(int id) {
		Product product=productdao.getProductById(id);
		ResponseStructure<Product> responseStructure=new ResponseStructure<>();
		if(product!=null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("product successfully found");
			responseStructure.setData(product);
			return responseStructure;
			
		}else {
			return null;
		}
	}
}
