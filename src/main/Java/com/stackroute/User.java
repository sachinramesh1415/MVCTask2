package com.stackroute;

public class User {
    private String name;
    private String password;
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return name;
    }
}
