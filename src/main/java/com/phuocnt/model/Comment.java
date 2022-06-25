package com.phuocnt.model;

import java.sql.Timestamp;

public class Comment extends AbstractModel {
    private String content;
    private long userId;
    private long newsId;

    public Comment() {
    }

    public Comment(String content, long userId, long newsId, long id, Timestamp createDate, Timestamp modifyDate, String createBy, String modifyBy) {
        this.content = content;
        this.userId = userId;
        this.newsId = newsId;
        this.setId(id);
        this.setCreateDate(createDate);
        this.setCreateBy(createBy);
        this.setModifyDate(modifyDate);
        this.setModifyBy(modifyBy);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }
}
