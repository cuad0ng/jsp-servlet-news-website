package com.phuocnt.model;

import java.sql.Timestamp;

public class Role extends AbstractModel {
    private String name;
    private String code;

    public Role() {
    }

    public Role(String name, String code, long id, Timestamp createDate, Timestamp modifyDate, String createBy, String modifyBy) {
        this.name = name;
        this.code = code;
        this.setId(id);
        this.setCreateDate(createDate);
        this.setCreateBy(createBy);
        this.setModifyDate(modifyDate);
        this.setModifyBy(modifyBy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
