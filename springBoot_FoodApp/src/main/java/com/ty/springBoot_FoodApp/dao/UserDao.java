package com.ty.springBoot_FoodApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springBoot_FoodApp.dto.User;
import com.ty.springBoot_FoodApp.repo.UserRepo;

@Repository
public class UserDao {
@Autowired
	private UserRepo repo;

public User saveUser(User user) {
	return repo.save(user);
}
public User updateUser(int id,User user) {
	User user2=repo.findById(id).get();
	if(user2!=null) {
		user.setId(id);
		repo.save(user);
		return user2;
	}else {
		return null;
	}
}
public User deleteUser(int id) {
	User user2=repo.findById(id).get();
	if(user2!=null) {
		repo.deleteById(id);;
		return user2;
	}else {
		return null;
	}
}
public User getUserById(int id) {
	User user= repo.findById(id).get();
	if(user!=null) {
		return user;
	}else {
		return null;
	}
}
}
