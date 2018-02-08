package com.blog.dao;

import java.util.List;

import com.blog.entity.Blog;

public interface BlogDao {
	//add the blog to the database
	void addPage(Blog blog);
	
	List <Blog> listAll();
	List <Blog> listAllOf(String type);
	
	
}
