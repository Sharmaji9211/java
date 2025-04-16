package com.codementor.controller;

import java.io.IOException;

import com.codementor.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardController extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
	   // Check if session exists and the user is logged in
       HttpSession session = req.getSession(false); // false means no new session is created
       if (session != null && session.getAttribute("user") != null) {

           // Fetch the cookies
           Cookie[] cookies = req.getCookies();
           String username = null;
           String isLoggedIn = null;

           if (cookies != null) {
               // Loop through cookies and get the username and login status
               for (Cookie cookie : cookies) {
                   if (cookie.getName().equals("username")) {
                       username = cookie.getValue();
                   }
                   if (cookie.getName().equals("isLoggedIn")) {
                       isLoggedIn = cookie.getValue();
                   }
               }
           }

           // If the user is logged in (check cookies)
           if (username != null && isLoggedIn != null && isLoggedIn.equals("true")) {
               // Assuming you have a User object in session, you can get it like this:
               User user = (User) session.getAttribute("user");
               
               // Now set the user data as request attributes
               req.setAttribute("isLoggedIn", isLoggedIn);
               req.setAttribute("cookieUsername", username);
               req.setAttribute("name", user.getName());
               req.setAttribute("username", user.getUsername());
               req.setAttribute("email", user.getEmail()); 
               req.setAttribute("password", user.getPassword());
               req.setAttribute("phone", user.getPhone());
               

               // Forward to the dashboard.jsp page
               req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
           } else {
               // Redirect to login if user is not logged in
               resp.sendRedirect("login.jsp");
           }
       } else {
           // Redirect to login if session doesn't exist or user is not logged in
           resp.sendRedirect("login.jsp");
       }
   
   }
}
