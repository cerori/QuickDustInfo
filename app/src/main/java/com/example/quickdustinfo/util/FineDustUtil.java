package com.example.quickdustinfo.util;

import com.example.quickdustinfo.model.FineDust;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FineDustUtil {
    private FineDustApi mGetApi;

    public FineDustUtil() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(FineDustApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.mGetApi = mRetrofit.create(FineDustApi.class);
    }

    public FineDustApi getApi() {
        return this.mGetApi;
    }
}
