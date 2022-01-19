package com.rancreation.toplist.models.retrofit;

/**
 * Created by xitebdeveloper on 5/8/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class District {

    @SerializedName("dist_id")
    @Expose
    private String distId;
    @SerializedName("dist_en")
    @Expose
    private String distEn;
    @SerializedName("dist_si")
    @Expose
    private String distSi;
    @SerializedName("dist_ta")
    @Expose
    private String distTa;
    @SerializedName("cities")
    @Expose
    private List<City> cities = null;

    public String getDistId() {
        return distId;
    }

    public void setDistId(String distId) {
        this.distId = distId;
    }

    public String getDistEn() {
        return distEn;
    }

    public void setDistEn(String distEn) {
        this.distEn = distEn;
    }

    public String getDistSi() {
        return distSi;
    }

    public void setDistSi(String distSi) {
        this.distSi = distSi;
    }

    public String getDistTa() {
        return distTa;
    }

    public void setDistTa(String distTa) {
        this.distTa = distTa;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
