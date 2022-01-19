package com.rancreation.toplist.models.retrofit;

/**
 * Created by xitebdeveloper on 5/5/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Subcategory {

    @SerializedName("subcat_id")
    @Expose
    private String subcatId;
    @SerializedName("subcat_en")
    @Expose
    private String subcatEn;
    @SerializedName("subcat_si")
    @Expose
    private String subcatSi;
    @SerializedName("subcat_ta")
    @Expose
    private String subcatTa;
    @SerializedName("subcat_icon")
    @Expose
    private String subcatIcon;

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    private String catId;

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