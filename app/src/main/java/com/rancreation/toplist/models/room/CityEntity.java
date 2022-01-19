package com.rancreation.toplist.models.room;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class CityEntity {

    @NonNull
    @PrimaryKey
    private String cityId;

    private String cityEn;

    private String citySi;

    private String cityTa;

    private String districtId;

    private String lat;

    private String lng;

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

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