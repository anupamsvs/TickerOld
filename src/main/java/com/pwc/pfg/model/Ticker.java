package com.pwc.pfg.model;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticker")
public class Ticker {

    @Id
    @GenericGenerator(name="generator",strategy="assigned")
    @GeneratedValue(generator="generator")
    @Column(name="ticker_Id")
    private String tickerId;

    @Column(name="user_current")
    private String currentUser;

    @Column(name="user_previous")
    private String previousUser;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private ServerStatus status;

    public Ticker() {
    }

    public Ticker(String tickerId, String currentUser, String previousUser, ServerStatus status) {
        this.tickerId = tickerId;
        this.currentUser = currentUser;
        this.previousUser = previousUser;
        this.status = status;
    }

    public String getTickerId() {
        return tickerId;
    }

    public void setTickerId(String tickerId) {
        this.tickerId = tickerId;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getPreviousUser() {
        return previousUser;
    }

    public void setPreviousUser(String previousUser) {
        this.previousUser = previousUser;
    }

    public ServerStatus getStatus() {
        return status;
    }

    public void setStatus(ServerStatus status) {
        this.status = status;
    }

}
