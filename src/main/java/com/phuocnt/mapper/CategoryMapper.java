package com.phuocnt.mapper;

import com.phuocnt.model.Category;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements IRowMapper<Category> {
    @Override
    public Category mapRow(ResultSet resultSet) {
        try {
            Category category = new Category();
            category.setId(resultSet.getLong("id"));
            category.setCode(resultSet.getString("code"));
            category.setName(resultSet.getString("name"));
            return category;
        } catch (SQLException e) {
            return null;
        }
    }
}
