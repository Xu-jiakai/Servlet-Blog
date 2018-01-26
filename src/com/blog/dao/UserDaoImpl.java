package com.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.blog.entity.User;

public class UserDaoImpl implements UserDao {
	
	private Connection conn=null;
	
	public UserDaoImpl() {
		conn=JdbcUtil.getConn();
	}

	@Override
	public Optional<User> check(String username) {
		// TODO Auto-generated method stub
		User user=null;
		String sql="select * from blog_user where username=?";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, username);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				user=new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
			}
			conn.close();
			pstmt.close();
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(user);
	}
}