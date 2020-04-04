package com.pwc.pfg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @Column(name="user_id")
    private String userId;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private char[] pwd;

    public User() {
    }

    public User(String userId, String name, char[] pwd) {
        this.userId = userId;
        this.name = name;
        this.pwd = pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPwd() {
        return pwd;
    }

    public void setPwd(char[] pwd) {
        this.pwd = pwd;
    }
}
