package com.phuocnt.dao.impl;

import com.phuocnt.dao.ICategoryDAO;
import com.phuocnt.mapper.CategoryMapper;
import com.phuocnt.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO {
    @Override
    public List<Category> findAll() {
        String sql = "SELECT * FROM table_category";
        return query(sql, new CategoryMapper());
    }
}