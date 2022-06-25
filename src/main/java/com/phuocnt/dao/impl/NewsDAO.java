package com.phuocnt.dao.impl;

import com.phuocnt.dao.INewsDAO;
import com.phuocnt.model.Category;
import com.phuocnt.model.News;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewsDAO implements INewsDAO {
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
    public List<News> findByCategoryId(long categoryId) {
        List<News> results = new ArrayList<>();
        String sql = "SELECT * FROM table_news WHERE category_id = ?";
        // open connection
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                //init param
                preparedStatement.setLong(1, categoryId);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    News news = new News();
                    news.setId(resultSet.getLong("id"));
                    news.setTitle(resultSet.getString("code"));
                    results.add(news);
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