package com.codementor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codementor.model.User;
import com.codementor.utils.DBUtil;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean registerUser(User user) {
        String query = "INSERT INTO users (username, password, email, phone, name) VALUES (?, ?, ?, ?, ?)";
        System.out.println("I am in registration");

        // Attempt to establish a connection and execute the insert query
        try (Connection conn = DBUtil.getConnection()) {
            if (conn == null) {
                System.err.println("Database connection failed.");
                return false;
            }
            System.out.println("Connection established. Ready to prepare the statement for query");
            PreparedStatement stmt = conn.prepareStatement(query);
            // Set parameters in the prepared statement
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword()); 
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getName());

            // Execute the insert query
            if (stmt.executeUpdate() > 0) {
                System.out.println("Data inserted successfully");
                return true;
            } else {
                System.out.println("Failed to insert data");
                return false;
            }

        } catch (SQLException e) {
            System.err.println("Error occurred while registering user");
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public User loginUser(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = DBUtil.getConnection()) {
            if (conn == null) {
                System.err.println("Database connection failed.");
                return null;
            }
            System.out.println("Connection established. Ready to prepare the statement for query");

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Map the result set to a User object
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setEmail(rs.getString("email"));
                    user.setPhone(rs.getString("phone"));
                    user.setName(rs.getString("name"));

                    return user;
                }
            }

        } catch (SQLException e) {
            System.err.println("Error occurred while logging in");
            e.printStackTrace();
        }

        return null; // Return null if no user is found
    }
}
