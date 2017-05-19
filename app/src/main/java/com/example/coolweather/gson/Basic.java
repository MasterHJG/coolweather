package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hp on 2017/5/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        //格式：2017-05-15 13:53 split(" ")
        @SerializedName("loc")
        public String updateTime;
    }
}
