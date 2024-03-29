package com.retrofit.myapplication;

import com.google.gson.annotations.SerializedName;

public class MiddlewareDTO {

    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;

    public MiddlewareDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MiddlewareDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

