package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.dto.Items;
import com.ty.springBoot_FoodApp.service.ItemService;

@RestController
public class ItemController {
@Autowired
	private ItemService service;
@PostMapping("/saveItems")
public Items saveItems(@RequestBody Items items) {
	return service.saveItems(items);
}
@PutMapping("updateItems")
public Items updateItems(@RequestParam int id ,@RequestBody Items items) {
	return service.updateItems(id, items);
}
@DeleteMapping("/deleteItems")
public Items deleteItems(@RequestParam int id) {
	return service.deleteItems(id);
}
@GetMapping("/getItemsbyid")
public Items getItemsById(@RequestParam int id) {
	return service.getItemsById(id);
}
}
