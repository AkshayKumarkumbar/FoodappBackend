package com.ty.springBoot_FoodApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_FoodApp.dto.FoodOrder;
import com.ty.springBoot_FoodApp.repo.FoodOrderRepo;
@Repository
public class FoodOrderDao {
@Autowired
private FoodOrderRepo repo;

public FoodOrder saveFoodOrder(FoodOrder foodorder) {
	return repo.save(foodorder);
}
public FoodOrder updateFoodOrder(FoodOrder foodorder,int id) {
	Optional<FoodOrder> foodorder2=repo.findById(id);
	if(foodorder2.isPresent()) {
		foodorder.setFid(id);
		foodorder.setItems(foodorder.getItems());
		repo.save(foodorder);
		return foodorder2.get();
	}else {return null;
	}
	}
public FoodOrder getFoodOrder(int id) {
	Optional<FoodOrder> foodorder=repo.findById(id);
	if(foodorder.isPresent()) {
		return foodorder.get();
	}else {
		return null;
	}

}
public FoodOrder deleteFoodOrder(int id) {
	Optional<FoodOrder> foodorder=repo.findById(id);
	if(foodorder.isPresent()) {
		repo.deleteById(id);
		return foodorder.get();
	}
		
	else {
		return null;
	}}

}
