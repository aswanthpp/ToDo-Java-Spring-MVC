package com.example.dataaccess.mysql;

import java.sql.Connection;

public class TestMySQLConnection {
    public void testConnection()   {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DatabaseManager.getConnection();
            System.out.println("Connection is successful !!!!!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
