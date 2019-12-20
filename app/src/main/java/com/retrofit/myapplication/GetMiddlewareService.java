package com.retrofit.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetMiddlewareService {

    String BASE_URL = "https://beta-middleware.rom3technology.com/";

    @GET("token")
    Call<MiddlewareList> getMiddleware();


}