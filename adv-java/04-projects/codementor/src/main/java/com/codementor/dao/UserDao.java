package com.codementor.dao;

import com.codementor.model.User;

public interface UserDao {
	
boolean registerUser(User user);
User loginUser(String username,String password);

}
