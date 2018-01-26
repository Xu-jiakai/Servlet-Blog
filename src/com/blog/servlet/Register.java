package com.blog.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.dao.DaoFactory;
import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.util.MessageType;
import com.blog.util.Validator;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String username=request.getParameter("username");
		String pwd1=request.getParameter("password");
		String pwd2=request.getParameter("password_again");
		
		if(!Objects.equals(pwd1,pwd2)) {
			request.setAttribute("asgType", MessageType.ERROR);
			request.setAttribute("msg", "The password is different twice");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return;
		}
		User user=new User();
		user.setUsername(username);
		user.setPassword(pwd1);
		userDao.addUser(user);
		response.sendRedirect("login.jsp");
		return;
		
	}
	
	@Override
	public void init()throws ServletException{
		super.init();
		userDao=DaoFactory.getUserDao();
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}

}
