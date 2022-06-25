package com.phuocnt.dao;

import com.phuocnt.model.News;

import java.util.List;

public interface INewsDAO {
    List<News> findByCategoryId(long categoryId);
}
