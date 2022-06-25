package com.phuocnt.dao;

import com.phuocnt.model.Category;

import java.util.List;

public interface ICategoryDAO {
    List<Category> findAll();
}
