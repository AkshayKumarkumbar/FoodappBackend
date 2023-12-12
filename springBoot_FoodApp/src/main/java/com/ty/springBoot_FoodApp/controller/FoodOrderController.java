package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.dto.FoodOrder;
import com.ty.springBoot_FoodApp.service.FoodOrderService;

@RestController
public class FoodOrderController {

	@Autowired
	private FoodOrderService service;
	
	@PostMapping("/savefoodorder")
	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodorder) {
		return service.saveFoodOrder(foodorder);
	}
	@PutMapping("/updatefoodorder")
	public FoodOrder updateFoodOrder(@RequestBody FoodOrder foodorder, @RequestParam int id) {
		return service.updateFoodOrder(foodorder, id);
	}
	@DeleteMapping("/deletefoodorder")
	public FoodOrder deleFoodOrder(@RequestParam int id) {
		return service.deleteFoodOrder(id);
	}
}
