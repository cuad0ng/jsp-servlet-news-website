package com.phuocnt.service.impl;

import com.phuocnt.dao.INewsDAO;
import com.phuocnt.model.News;
import com.phuocnt.service.INewsService;

import javax.inject.Inject;
import java.util.List;

public class NewsService implements INewsService {
    @Inject
    private INewsDAO newsDAO;
    @Override
    public List<News> findByCategoryId(long categoryId) {
        return newsDAO.findByCategoryId(categoryId);
    }

    @Override
    public News save(News news) {
        Long id = newsDAO.save(news);
        System.out.println(id);
        return null;
    }
}
