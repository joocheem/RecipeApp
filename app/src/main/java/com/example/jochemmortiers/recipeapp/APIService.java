package com.example.jochemmortiers.recipeapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface APIService {

    String BASE_URL = "https://www.food2fork.com/api/";
    String API_KEY = "1b6c36661e575c5fbb7f12944ca9c2ee";
    String SORT = "&?sort=t&count=30";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("search?key=" + API_KEY + SORT)
    Call<APIAnswer> getRecepten();
}
