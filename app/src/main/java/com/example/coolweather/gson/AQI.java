package com.example.coolweather.gson;

/**
 * Created by hp on 2017/5/15.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
