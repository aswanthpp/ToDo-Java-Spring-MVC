package com.example.dataaccess.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    // init database constants
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/notes";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootpass";
    private static final String MAX_POOL = "250";
    // init connection object
    private Connection connection;
    // init properties object
    private Properties properties;

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
//        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);


    }

    public Connection testConnection() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/notes", "root", "rootpass")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
                return conn;
            } else {
                System.out.println("Failed to make connection!");
                return null;
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
