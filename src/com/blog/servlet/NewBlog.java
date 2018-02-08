package com.blog.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.dao.BlogDao;
import com.blog.dao.DaoFactory;
import com.blog.entity.Blog;

/**
 * Servlet implementation class NewBlog
 */
@WebServlet("/NewBlog")
public class NewBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BlogDao blogDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewBlog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String type=request.getParameter("type");
		String content=request.getParameter("content");
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String create_time=sdf.format(date);
		Blog blog=new Blog();
		blog.setTitle(title);
		blog.setAuthor(author);
		blog.setType(type);
		blog.setContent(content);
		blog.setCreate_time(create_time);
		blogDao.addPage(blog);
		response.sendRedirect("index.jsp");
		return;
	}
	public void init()throws ServletException{
		super.init();
		blogDao=DaoFactory.getBlogDao();
	}

}
