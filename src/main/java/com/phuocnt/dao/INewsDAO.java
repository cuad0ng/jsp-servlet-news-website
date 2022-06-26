package com.phuocnt.dao;

import com.phuocnt.model.News;

import java.util.List;

public interface INewsDAO extends  IGenericDAO<News>{
    List<News> findByCategoryId(long categoryId);
    Long save(News news);
}
