package com.phuocnt.service.impl;

import com.phuocnt.dao.ICategoryDAO;
import com.phuocnt.dao.impl.CategoryDAO;
import com.phuocnt.model.Category;
import com.phuocnt.service.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {

    @Inject
    private ICategoryDAO categoryDAO;

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }
}
