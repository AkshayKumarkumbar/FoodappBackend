package com.ty.springBoot_FoodApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_FoodApp.dto.Menu;

import com.ty.springBoot_FoodApp.repo.MenuRepo;
@Repository
public class MenuDao {
@Autowired
	private MenuRepo repo;

public Menu saveMenu(Menu menu) {
	return repo.save(menu);
}
public Menu updateMenu(int mid,Menu menu) {
	Menu menu2=repo.findById(mid).get();
	if(menu2!=null) {
		menu.setMid(mid);
		repo.save(menu);
		return menu2;
	}else {
		return null;
	}
}
public Menu deleteMenu(int mid) {
	Menu menu2=repo.findById(mid).get();
	if(menu2!=null) {
		repo.deleteById(mid);;
		return menu2;
	}else {
		return null;
	}
}
public Menu getMenuById(int mid) {
	Menu menu= repo.findById(mid).get();
	if(menu!=null) {
		return menu;
	}else {
		return null;
	}
}
}
