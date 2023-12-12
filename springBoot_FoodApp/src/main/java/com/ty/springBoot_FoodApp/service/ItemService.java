package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.dao.ItemDao;
import com.ty.springBoot_FoodApp.dto.Items;

@Service
public class ItemService {
@Autowired
	private ItemDao Itemsdao;

public Items saveItems(Items Items) {
	return Itemsdao.saveItems(Items);
}
public Items updateItems(int id,Items items) {
	Items items2=Itemsdao.updateItems(id, items);
	if(items2!=null) {
		return items;
	}else {
		return null;
	}
}

public Items deleteItems(int id ) {
	Items items=Itemsdao.deleteItems(id);
	if(items!=null) {
		return items;
	}else {
		return null;
	}
}
public Items getItemsById(int id) {
	Items items=Itemsdao.getItemsById(id);
	if(items!=null) {
		return items;
	}else {
		return null;
	}
}
}
