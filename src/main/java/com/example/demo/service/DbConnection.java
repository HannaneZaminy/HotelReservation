package com.example.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String JDBS_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3307/hotel";
    private static final String USER = "root";
    private static final String PASS = "1377722";
    private Connection connection = null;
    public static DbConnection dbConnection = new DbConnection();

    public DbConnection() {
        try {
            Class.forName(JDBS_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
