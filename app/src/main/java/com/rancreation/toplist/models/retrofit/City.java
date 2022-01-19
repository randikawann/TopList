package com.rancreation.toplist.models.retrofit;

/**
 * Created by xitebdeveloper on 5/8/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class City {

    @SerializedName("city_id")
    @Expose
    private String cityId;
    @SerializedName("city_en")
    @Expose
    private String cityEn;
    @SerializedName("city_si")
    @Expose
    private String citySi;
    @SerializedName("city_ta")
    @Expose
    private String cityTa;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public String getCitySi() {
        return citySi;
    }

    public void setCitySi(String citySi) {
        this.citySi = citySi;
    }

    public String getCityTa() {
        return cityTa;
    }

    public void setCityTa(String cityTa) {
        this.cityTa = cityTa;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

}