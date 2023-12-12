package com.ty.springBoot_FoodApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springBoot_FoodApp.dto.Menu;

import com.ty.springBoot_FoodApp.service.MenuService;

@RestController
public class MenuController {
@Autowired
	private MenuService service;
	
	@PostMapping("/savemenu")
	public Menu saveMenu(@RequestBody Menu menu) {
		return service.saveMenu(menu);
	}
	@PutMapping("/updatemenu")
	public Menu updateMenu(@RequestParam int id ,@RequestBody Menu menu) {
		return service.updateMenu(id, menu);
	}
	@DeleteMapping("/deletemenu")
	public Menu deleteMenu(@RequestParam int id) {
		return service.deleteMenu(id);
	}
	@GetMapping("/getmenubyid")
	public Menu getMenuById(@RequestParam int id) {
		return service.getMenuById(id);
	}
}
