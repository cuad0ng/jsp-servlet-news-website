package com.phuocnt.dao;

import com.phuocnt.model.Category;

import java.util.List;

public interface ICategoryDAO extends IGenericDAO<Category> {
    List<Category> findAll();
}
