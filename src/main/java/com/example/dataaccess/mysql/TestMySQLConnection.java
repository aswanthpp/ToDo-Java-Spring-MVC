package com.example.dataaccess.mysql;

import java.sql.Connection;

public class TestMySQLConnection {
    public void testConnection() {
        try {
            DatabaseManager.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

