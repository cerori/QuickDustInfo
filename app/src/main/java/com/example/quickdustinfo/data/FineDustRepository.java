package com.example.quickdustinfo.data;


import com.example.quickdustinfo.model.FineDust;

import retrofit2.Callback;

public interface FineDustRepository {
    boolean isAvailable();
    void getFindDustData(Callback<FineDust> callback);
}
