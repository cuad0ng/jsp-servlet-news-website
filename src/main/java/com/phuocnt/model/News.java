package com.phuocnt.model;

import java.sql.Timestamp;

public class News extends AbstractModel {
    private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;
    private Long categoryId;

    public News() {
    }

    public News(String title, String thumbnail, String shortDescription, String content, Long categoryId, Long id, Timestamp createDate, Timestamp modifyDate, String createBy, String modifyBy) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.shortDescription = shortDescription;
        this.content = content;
        this.categoryId = categoryId;
        this.setId(id);
        this.setCreateDate(createDate);
        this.setCreateBy(createBy);
        this.setModifyDate(modifyDate);
        this.setModifyBy(modifyBy);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}