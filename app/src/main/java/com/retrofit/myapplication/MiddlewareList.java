package com.retrofit.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MiddlewareList {

    @SerializedName("users")
    private List<MiddlewareDTO> users;

    public List<MiddlewareDTO> getUsers() {
        return users;
    }

    public void setUsers(List<MiddlewareDTO> users) {
        this.users = users;
    }

}
