package com.example.aluas.androidnewapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by aluas on 10.10.2017.
 */

public interface ApiService {
    @GET("posts")
    Call<List<News>> getPosts();


    @GET("api/7fa44ef7-ad76-11e7-a347-d1aa5add8258")
    Call<List<News>> getNewsAPIList();



}
