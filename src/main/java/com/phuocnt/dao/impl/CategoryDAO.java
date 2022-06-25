package com.phuocnt.dao.impl;

import com.phuocnt.dao.ICategoryDAO;
import com.phuocnt.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CategoryDAO implements ICategoryDAO {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://remotemysql.com:3306/q6YxYh8MkA";
            String username = "q6YxYh8MkA";
            String password = "OQXX2gxATv";
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }

    }

    @Override
    public List<Category> findAll() {
        List<Category> results = new ArrayList<>();
        String sql = "SELECT * FROM table_category";
        // open connection
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Category category = new Category();
                    category.setId(resultSet.getLong("id"));
                    category.setCode(resultSet.getString("code"));
                    category.setName(resultSet.getString("name"));
                    results.add(category);
                }

                return results;
            } catch (SQLException e) {
                return null;
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (SQLException e) {
                    return null;
                }
            }
        }
        return null;
    }
}