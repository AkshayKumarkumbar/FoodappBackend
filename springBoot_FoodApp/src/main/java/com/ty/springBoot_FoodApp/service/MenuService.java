package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ty.springBoot_FoodApp.dao.MenuDao;
import com.ty.springBoot_FoodApp.dto.Menu;


@Service
public class MenuService {

	@Autowired
	private MenuDao menudao;
	
	public Menu saveMenu(Menu menu) {
		return menudao.saveMenu(menu);
	}
	public Menu updateMenu(int id,Menu menu) {
		Menu menu2=menudao.updateMenu(id, menu);
		if(menu2!=null) {
			return menu;
		}else {
			return null;
		}
	}

	public Menu deleteMenu(int id ) {
		Menu menu=menudao.deleteMenu(id);
		if(menu!=null) {
			return menu;
		}else {
			return null;
		}
	}
	public Menu getMenuById(int id) {
		Menu menu=menudao.getMenuById(id);
		if(menu!=null) {
			return menu;
		}else {
			return null;
		}
	}
	
}
