package com.services;

import java.util.List;

import com.model.User;



public interface UserService {

	void save(User user);
	User findByName(String email);
	List<User> login(User user);
}
