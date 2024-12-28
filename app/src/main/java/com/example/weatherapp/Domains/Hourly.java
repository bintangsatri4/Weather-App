package com.example.weatherapp.Domains;

public class Hourly {
    private String hour;
    private String picPath;
    private int temp;

    private Hourly(String hour,int temp,String picPath){
        this.hour = hour;
        this.temp = temp;
        this.picPath = picPath;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}