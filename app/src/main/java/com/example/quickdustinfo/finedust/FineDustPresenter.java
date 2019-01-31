package com.example.quickdustinfo.finedust;

import com.example.quickdustinfo.data.FineDustRepository;
import com.example.quickdustinfo.model.FineDust;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FineDustPresenter implements FineDustContract.UserActionListener {
    private final FineDustRepository mRepository;
    private final FineDustContract.View mView;

    public FineDustPresenter(FineDustRepository repository, FineDustContract.View view) {
        mRepository = repository;
        mView = view;
    }

    @Override
    public void loadFineDustData() {
        if (mRepository.isAvailable()) {
            mView.loadingStart();
            mRepository.getFindDustData(new Callback<FineDust>() {
                @Override
                public void onResponse(Call<FineDust> call, Response<FineDust> response) {
                    mView.showFineDustResult(response.body());
                    mView.loadingEnd();
                }

                @Override
                public void onFailure(Call<FineDust> call, Throwable t) {
                    mView.showLoadError(t.getLocalizedMessage());
                    mView.loadingEnd();
                }
            });
        }
    }
}
