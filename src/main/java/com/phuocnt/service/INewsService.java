package com.phuocnt.service;

import com.phuocnt.model.News;

import java.util.List;

public interface INewsService {
List<News> findByCategoryId(long categoryId);
}
