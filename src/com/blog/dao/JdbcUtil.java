package com.blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	private static Connection conn;
	private static final String URL="jdbc:postgresql://localhost:5432/servlet";
	private static final String USER="postgres";
	private static final String PASSWD="123";
	
	private JdbcUtil() {}
	
	public static Connection getConn() {
		try {
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection(URL,USER,PASSWD);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return conn;
	}
}
