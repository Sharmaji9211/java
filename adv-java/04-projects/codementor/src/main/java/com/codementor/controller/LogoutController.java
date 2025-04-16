package com.codementor.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
@WebServlet("/logout")
public class LogoutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Invalidate the session
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        // Remove cookies
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    cookie.setValue("");
                    cookie.setMaxAge(0); // Expire the cookie
                    cookie.setPath("/"); // Same path as the login page
                    resp.addCookie(cookie);
                }
                if (cookie.getName().equals("isLoggedIn")) {
                    cookie.setValue("");
                    cookie.setMaxAge(0); // Expire the cookie
                    cookie.setPath("/"); // Same path as the login page
                    resp.addCookie(cookie);
                }
            }
        }

        // Redirect to login page after logout
        resp.sendRedirect("logout.jsp");
    }
}
