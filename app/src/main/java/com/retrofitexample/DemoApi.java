package com.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DemoApi {
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
