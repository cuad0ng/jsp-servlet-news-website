package com.phuocnt.mapper;

import com.phuocnt.model.News;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsMapper implements IRowMapper<News> {
    @Override
    public News mapRow(ResultSet resultSet) {
        News news = new News();
        try {
            news.setId(resultSet.getLong("id"));
            news.setTitle(resultSet.getString("code"));
            return news;
        } catch (SQLException e) {
            return null;
        }
    }
}
