package com.blog.dao;

import java.util.Optional;

import com.blog.entity.User;

public interface UserDao {
	Optional<User> check(String username);
}
