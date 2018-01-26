package com.blog.servlet;

import java.io.IOException;
import java.util.Optional;

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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private UserDao userDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String password=request.getParameter("password");
		//check the input if null
		if(Validator.hasNull(username,password)) {
			request.setAttribute("msgType", MessageType.ERROR);
			request.setAttribute("msg", "Name and password cannot be empty");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		Optional<User> user=userDao.check(username);
		if(user.isPresent()&&user.get().getPassword().equals(password)) {
			request.getSession().setAttribute("user", user.get().getUsername());
			response.sendRedirect("index.jsp");//must be add a return
			return;
		}else {
			request.setAttribute("msgType", MessageType.ERROR);
			request.setAttribute("msg", "wrong username and password,please input again");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	
	@Override
	public void init()throws ServletException{
		super.init();
		userDao=DaoFactory.getUserDao();
	}

}
