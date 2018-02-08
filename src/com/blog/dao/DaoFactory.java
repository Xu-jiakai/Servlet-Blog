package com.blog.dao;

public class DaoFactory {
	private static UserDao userDao;
	private static BlogDao blogDao;
	
	static {
		userDao=new UserDaoImpl();
		blogDao=new BlogDaoImpl();
	}
	public static UserDao getUserDao() {
		return userDao;
	}
	public static BlogDao getBlogDao() {
		return blogDao;
	}
}
