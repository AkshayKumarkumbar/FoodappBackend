package com.ty.springBoot_FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.dao.FoodOrderDao;
import com.ty.springBoot_FoodApp.dto.FoodOrder;
import com.ty.springBoot_FoodApp.dto.Items;

@Service
public class FoodOrderService {

	@Autowired
	private FoodOrderDao dao;

	public FoodOrder saveFoodOrder(FoodOrder foodorder) {
		List<Items>list= foodorder.getItems();
		double totalprice=0;
		for (Items items:list) {
			totalprice+=items.getCost()*items.getQuantity();
			foodorder.setTotalprice(totalprice);
		}
		
		return dao.saveFoodOrder(foodorder);
	}
	public FoodOrder updateFoodOrder(FoodOrder foodorder,int id) {
		FoodOrder foodOrder2=dao.getFoodOrder(id);
		if(foodOrder2!=null) {
		List<Items>list= foodorder.getItems();
		double totalprice=0;
		for (Items items:list) {
			totalprice+=items.getCost()*items.getQuantity();
			foodorder.setTotalprice(totalprice);
		}
			
			return dao.updateFoodOrder(foodorder, id);}
		else {
			return null;
		}
		
		
	
	}
	public FoodOrder deleteFoodOrder(int id) {
		FoodOrder foodorder=dao.deleteFoodOrder(id);
		if(foodorder!=null) {
			return foodorder;
		}else {
			return null;
		}
	}
	
}
