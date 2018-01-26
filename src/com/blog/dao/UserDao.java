package com.blog.dao;

import java.util.Optional;

import com.blog.entity.User;

public interface UserDao {
	//check the username message
	Optional<User> check(String username);
	//check the username is existence
	boolean hasUsername(String username);
	//add the username
	void addUser(User user);
	
}
