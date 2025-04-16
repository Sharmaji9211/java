package com.codementor.controller;
import java.io.IOException;

import com.codementor.dao.UserDao;
import com.codementor.dao.UserDaoImpl;
import com.codementor.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationController extends HttpServlet{
		private final UserDao userDAO=new UserDaoImpl();
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String name=req.getParameter("name");
			String username=req.getParameter("username");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String phone=req.getParameter("phone");
			
			User user=new User();
			
			user.setName(name);
			user.setUsername(username);
			user.setEmail(email);
			user.setPassword(password);
			user.setPhone(phone);
			
			if(userDAO.registerUser(user)) {
				
				resp.sendRedirect("login.jsp");
				
			}else {
				resp.getWriter().println("Registration failed");
			}
		}
		
}
