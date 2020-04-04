package com.pwc.pfg.model;

public enum ServerStatus {

    ENGAGED ("Engaged"),
    AVAILABLE ("Available");

    private String value;
    ServerStatus(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
