package com.example.quickdustinfo.model.dust_meterial;

public class Weather {
    private java.util.List<List> list;

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "list=" + list +
                '}';
    }
}
