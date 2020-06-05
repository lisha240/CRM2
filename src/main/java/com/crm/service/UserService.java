package com.crm.service;

import java.util.List;

import com.crm.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String email);

	

}
