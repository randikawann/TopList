package com.rancreation.toplist.models.room;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rancreation.toplist.models.retrofit.City;

import java.util.List;

@Entity
public class DistrictEntity {

    @NonNull
    @PrimaryKey
    private String distId;

    private String distEn;

    private String distSi;

    private String distTa;

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

}
