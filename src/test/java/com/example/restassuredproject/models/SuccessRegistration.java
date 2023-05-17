package com.example.restassuredproject.models;

public class SuccessRegistration {
    private Integer id;
    private String token;

    public SuccessRegistration(int id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
