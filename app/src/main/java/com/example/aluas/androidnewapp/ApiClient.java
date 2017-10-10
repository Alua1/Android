package com.example.aluas.androidnewapp;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aluas on 10.10.2017.
 */

public class ApiClient {
    public static final String Base_URL = "https://jsonblob.com/";
    private static Retrofit retrofit = null;
    public static Retrofit GetClient(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder okHTTPClient  = new OkHttpClient.Builder().readTimeout(15, TimeUnit.SECONDS).connectTimeout(15, TimeUnit.SECONDS);
        okHTTPClient.addInterceptor(interceptor);
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                                    .baseUrl(Base_URL)
                                    .client(okHTTPClient.build())
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
        }
        return retrofit;
    }
}
