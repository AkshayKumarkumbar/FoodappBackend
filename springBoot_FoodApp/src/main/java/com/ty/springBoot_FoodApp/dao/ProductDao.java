package com.ty.springBoot_FoodApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_FoodApp.dto.Product;

import com.ty.springBoot_FoodApp.repo.ProductRepo;

@Repository
public class ProductDao {
@Autowired
	private ProductRepo repo;

public Product saveProduct(Product product) {
	return repo.save(product);
}
public Product updateProduct(int pid,Product product) {
	Product product2=repo.findById(pid).get();
	if(product2!=null) {
		product.setPid(pid);
		repo.save(product);
		return product2;
	}else {
		return null;
	}
}
public Product deleteProduct(int pid) {
	Product product2=repo.findById(pid).get();
	if(product2!=null) {
		repo.deleteById(pid);;
		return product2;
	}else {
		return null;
	}
}
public Product getProductById(int pid) {
	Product product= repo.findById(pid).get();
	if(product!=null) {
		return product;
	}else {
		return null;
	}
}


}
