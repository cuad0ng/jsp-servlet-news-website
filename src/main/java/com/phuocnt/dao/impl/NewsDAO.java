package com.phuocnt.dao.impl;

import com.phuocnt.dao.INewsDAO;
import com.phuocnt.mapper.NewsMapper;
import com.phuocnt.model.News;

import java.sql.*;
import java.util.List;

public class NewsDAO extends AbstractDAO<News> implements INewsDAO {
    @Override
    public List<News> findByCategoryId(long categoryId) {
        String sql = "SELECT * FROM table_news WHERE category_id = ?";
        return query(sql, new NewsMapper(), categoryId);
    }

    @Override
    public Long save(News news) {
        String sql = "INSERT INTO table_news (title, content, category_id) VALUE (?, ?, ?)";
        return insert(sql, news.getTitle(),news.getContent(), news.getCategoryId());
    }
}