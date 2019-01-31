package com.example.quickdustinfo.data;

import com.example.quickdustinfo.model.FineDust;
import com.example.quickdustinfo.util.FineDustUtil;

import retrofit2.Callback;

public class LocationFineDustRepository implements FineDustRepository {
    private FineDustUtil mFineDustUtil;
    private double mLatitude;
    private double mLongtitude;

    public LocationFineDustRepository() {
        mFineDustUtil = new FineDustUtil();
    }

    public LocationFineDustRepository(double lat, double lng) {
        this();
        mLatitude = lat;
        mLongtitude = lng;
    }


    @Override
    public boolean isAvailable() {
        if (mLatitude != 0.0 && mLongtitude != 0.0) {
            return true;
        }
        return false;
    }

    @Override
    public void getFindDustData(Callback<FineDust> callback) {

    }
}