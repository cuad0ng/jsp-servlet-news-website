package com.phuocnt.model;

import java.sql.Timestamp;

public class User extends AbstractModel{
    private String userName;
    private String passWord;
    private String fullName;
    private boolean status;
    private long roleId;

    public User() {
    }

    public User(long id, String userName, String passWord, String fullName, boolean status, long roleId, Timestamp createDate, Timestamp modifyDate, String createBy, String modifyBy) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.status = status;
        this.roleId = roleId;
        this.setId(id);
        this.setCreateDate(createDate);
        this.setCreateBy(createBy);
        this.setModifyDate(modifyDate);
        this.setModifyBy(modifyBy);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
}
