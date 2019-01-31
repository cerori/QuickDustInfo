package com.example.quickdustinfo.model.dust_meterial;

class List {
    private String dateTime;
    private String pm10Value;
    private String stationName;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPm10Value() {
        return pm10Value;
    }

    public void setPm10Value(String pm10Value) {
        this.pm10Value = pm10Value;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "List{" +
                "dateTime='" + dateTime + '\'' +
                ", pm10Value='" + pm10Value + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}
