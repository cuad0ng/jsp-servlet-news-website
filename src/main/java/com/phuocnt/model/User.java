package com.phuocnt.model;

public class User {
    private String userName;
    private String fullName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User() {
    }

    public User(String userName, String fullName) {
        this.userName = userName;
        this.fullName = fullName;
    }
}