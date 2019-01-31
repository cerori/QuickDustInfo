package com.example.quickdustinfo.model;

import com.example.quickdustinfo.model.dust_meterial.Weather;

public class FineDust {
    private Weather weather;
    private int totalCount;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "FineDust{" +
                "weather=" + weather +
                ", totalCount=" + totalCount +
                '}';
    }
}
