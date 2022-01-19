package com.rancreation.toplist.models.room;

/**
 * Created by xitebdeveloper on 5/5/17.
 */

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class CategoryEntity {

    @NonNull
    @PrimaryKey
    private String catId;

    private String catEn;

    private String catSi;

    private String catTa;

    private String catIcon;

    private String type;


    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCatEn() {
        return catEn;
    }

    public void setCatEn(String catEn) {
        this.catEn = catEn;
    }

    public String getCatSi() {
        return catSi;
    }

    public void setCatSi(String catSi) {
        this.catSi = catSi;
    }

    public String getCatTa() {
        return catTa;
    }

    public void setCatTa(String catTa) {
        this.catTa = catTa;
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon;
    }

}
