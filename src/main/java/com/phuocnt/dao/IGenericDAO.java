package com.phuocnt.dao;

import com.phuocnt.mapper.IRowMapper;

import java.util.List;

public interface IGenericDAO<T> {
    <T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters);
    void update(String sql, Object... parameters);
    Long insert(String sql, Object... parameters);
}
