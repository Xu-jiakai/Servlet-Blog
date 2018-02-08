package com.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.blog.entity.Blog;

public class BlogDaoImpl implements BlogDao {
	private Connection conn=null;
	
	public BlogDaoImpl() {
		conn=JdbcUtil.getConn();
	}

	@Override
	public void addPage(Blog blog) {
		// add the blog to the database
		String sql="BEGIN;insert into blog_article (title,author,type,create_time,modify_time)"
				+ "values(?,?,?,?,?);insert into blog_content(content)values(?);COMMIT;";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, blog.getTitle());
			pstmt.setString(2, blog.getAuthor());
			pstmt.setString(6, blog.getContent());
			pstmt.setString(3,blog.getType());
			pstmt.setString(4, blog.getCreate_time());
			pstmt.setString(5, blog.getModify_time());
			pstmt.executeUpdate();
			
			conn.close();
			pstmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Blog> listAll() {
		// TODO Auto-generated method stub
		List<Blog> articles=new ArrayList<>();
		String sql="select blog_article.id,title,author,type,create_time,modify_time,blog_content.content from blog_article,blog_content where blog_article.id=blog_content.id";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Blog blog=new Blog();
				blog.setId(rs.getInt(1));
				blog.setTitle(rs.getString(2));
				blog.setAuthor(rs.getString(3));
				blog.setType(rs.getString(4));
				blog.setCreate_time(rs.getString(5));
				blog.setModify_time(rs.getString(6));
				blog.setContent(rs.getString(7));
				articles.add(blog);
			}
			conn.close();
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return articles;
	}

	@Override
	public List<Blog> listAllOf(String type) {
		// TODO Auto-generated method stub
		List<Blog> articles=new ArrayList<>();
		String sql="select blog_article.id,title,author,type,create_time,modify_time,blog_content.content from blog_article,blog_content where blog_article.id=blog_content.id and type=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, type);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Blog blog=new Blog();
				blog.setId(rs.getInt(1));
				blog.setTitle(rs.getString(2));
				blog.setAuthor(rs.getString(3));
				blog.setType(rs.getString(4));
				blog.setCreate_time(rs.getString(5));
				blog.setModify_time(rs.getString(6));
				blog.setContent(rs.getString(7));
				articles.add(blog);
			}
			conn.close();
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return articles;
	}
	
	public static void main(String[] args) {
		BlogDaoImpl blog=new BlogDaoImpl();
		List<Blog> articles=blog.listAll();
		int size=articles.size();
		for (int i=0;i<size;i++){
			System.out.println(articles.get(i).getCreate_time());
		}
	}
}
