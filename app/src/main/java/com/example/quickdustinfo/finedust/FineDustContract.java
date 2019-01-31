package com.example.quickdustinfo.finedust;

import com.example.quickdustinfo.model.FineDust;

public interface FineDustContract {
    interface View {
        void showFineDustResult(FineDust fineDust);
        void showLoadError(String message);
        void loadingStart();
        void loadingEnd();
        void reload(double lat, double lng);
    }

    interface UserActionListener {
        void loadFineDustData();
    }
}
