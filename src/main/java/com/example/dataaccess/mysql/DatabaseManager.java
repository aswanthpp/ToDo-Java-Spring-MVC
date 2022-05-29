package com.example.dataaccess.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/notes";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootpass";

    public static Connection getConnection()  {
        try {
            Connection conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            if (conn != null) {
                System.out.println("Connected to the database!");
                return conn;
            } else {
                System.out.println("Failed to make connection!");
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



}
