package com.codementor.controller;

import com.codementor.dao.UserDaoImpl;
import com.codementor.model.User;
import com.codementor.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private final UserDao userDAO = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Validate input to prevent injection attacks
        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            resp.getWriter().println("Username and password must not be empty");
            return;
        }

        User user = userDAO.loginUser(username, password);

        if (user != null) {
            // Create session and store the user object
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(30 * 60); // Session timeout after 30 minutes

            // Create cookies to remember the user (Optional, make sure they are secure)
            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(60 * 60 * 24 * 7); // Set cookie expiry to 7 days
            usernameCookie.setPath("/"); // Make cookie accessible across the entire domain
            usernameCookie.setSecure(true); // Set the secure flag for HTTPS
            usernameCookie.setHttpOnly(true); // Prevent client-side access to the cookie

            Cookie loginCookie = new Cookie("isLoggedIn", "true");
            loginCookie.setMaxAge(60 * 60 * 24 * 7); // Cookie expires in 7 days
            loginCookie.setPath("/"); // Set path to the whole domain
            loginCookie.setSecure(true); // Ensure the cookie is sent only over HTTPS
            loginCookie.setHttpOnly(true); // Prevent client-side access

            // Add cookies to the response
            resp.addCookie(usernameCookie);
            resp.addCookie(loginCookie);

            // Redirect to the dashboard after successful login
            resp.sendRedirect("dashboard");
        } else {
            // Handle invalid login attempt
            resp.getWriter().println("Invalid credentials, please try again.");
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }
}
