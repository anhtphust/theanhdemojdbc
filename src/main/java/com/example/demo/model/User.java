package com.example.demo.model;

public class User {
    private int id;
    private String username;
    private int userage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public User(int id, String username, int userage) {
        this.id = id;
        this.username = username;
        this.userage = userage;
    }

    public User() {
    }
}
