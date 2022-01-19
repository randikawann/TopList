package com.rancreation.toplist.models.room;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class SubcategoryEntity {

    @NonNull
    @PrimaryKey
    private String subcatId;

    private String catId;

    private String subcatEn;

    private String subcatSi;

    private String subcatTa;

    private String subcatIcon;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getSubcatId() {
        return subcatId;
    }

    public void setSubcatId(String subcatId) {
        this.subcatId = subcatId;
    }

    public String getSubcatEn() {
        return subcatEn;
    }

    public void setSubcatEn(String subcatEn) {
        this.subcatEn = subcatEn;
    }

    public String getSubcatSi() {
        return subcatSi;
    }

    public void setSubcatSi(String subcatSi) {
        this.subcatSi = subcatSi;
    }

    public String getSubcatTa() {
        return subcatTa;
    }

    public void setSubcatTa(String subcatTa) {
        this.subcatTa = subcatTa;
    }

    public String getSubcatIcon() {
        return subcatIcon;
    }

    public void setSubcatIcon(String subcatIcon) {
        this.subcatIcon = subcatIcon;
    }


}