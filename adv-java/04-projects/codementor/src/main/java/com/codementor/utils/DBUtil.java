package com.codementor.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/code_mentor";
    private static final String USER = "tecresearch";
    private static final String PASSWORD = "Admin@tca";

    public static Connection getConnection() {
        try {
            // Load the JDBC driver
            System.out.println("Connecting to: " + URL);
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            if (con != null) {
                System.out.println("Database connection successfully established.");
                return con;
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        return null;
    }

   
}
