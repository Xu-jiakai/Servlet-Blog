package com.blog.dao;

public class DaoFactory {
	private static UserDao userDao;
	
	static {
		userDao=new UserDaoImpl();
	}
	public static UserDao getUserDao() {
		return userDao;
	}
}
