package com.ty.springBoot_FoodApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_FoodApp.dto.Items;
import com.ty.springBoot_FoodApp.repo.ItemRepo;
@Repository
public class ItemDao {
	@Autowired
	private ItemRepo repo;

	public Items saveItems(Items items) {
		return repo.save(items);
		
	}

	public Items updateItems(int item_id, Items items) {
		Items items2=repo.findById(item_id).get();
		if(items2!=null) {
			items.setItem_id(item_id);
			repo.save(items);
			return items2;
		}else {
			return null;
		}
		
	}

	public Items deleteItems(int item_id) {
		Items items2=repo.findById(item_id).get();
		if(items2!=null) {
			repo.deleteById(item_id);
			return items2;
		}else {
			return null;
		}
		
	}

	public Items getItemsById(int item_id) {
		Items items=repo.findById(item_id).get();
		if(items!=null) {
			return items;
		}else {
			return null;
		}
		
	}

}
