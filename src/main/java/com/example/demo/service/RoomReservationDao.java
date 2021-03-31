package com.example.demo.service;

import java.sql.*;
import java.util.Date;;

public class RoomReservationDao {


    public void reserve(String name, int nationalCode, int capacity, String start, String end, int roomNumber, int trackingNumber) {
        Connection connection = DbConnection.dbConnection.getConnection();
        PreparedStatement statement = null;

        try {
            String query = "INSERT INTO bookinginformation VALUES (?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(query);
            statement.setInt(1, nationalCode);
            statement.setString(2, name);
            statement.setInt(3, capacity);
            statement.setString(4, start);
            statement.setString(4, end);
            statement.setInt(5, roomNumber);
            statement.setInt(6, trackingNumber);
            statement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public boolean checkUser(int cod) {
        String sql = "SELECT  * FROM bookinginformation where NationalCode=?";
        Connection connection = DbConnection.dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, cod);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }


    public String View(String username) {
        Connection connection = DbConnection.dbConnection.getConnection();
        Statement statement = null;
        try {
            String sql = "SELECT  * FROM bookinginformation where NationalCode=?";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString(2);
                int nationalCode = resultSet.getInt(1);
                int capacity = resultSet.getInt(3);
                String start = resultSet.getString(4);
                String end = resultSet.getString(5);
                int roomNumber = resultSet.getInt(6);
                int trackingNumber = resultSet.getInt(7);
                return name + nationalCode + capacity + start;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void cancellation(String username) {
        Connection connection = DbConnection.dbConnection.getConnection();
        PreparedStatement statement = null;
        try {
            String sql = "DELETE  * FROM bookinginformation where NationalCode=?";
            ResultSet resultSet = statement.executeQuery(sql);
            statement.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


