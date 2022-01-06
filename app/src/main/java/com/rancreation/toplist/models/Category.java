package com.rancreation.toplist.models;

/**
 * Created by xitebdeveloper on 5/5/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {
    @SerializedName("cat_id")
    @Expose
    private String catId;

    @SerializedName("cat_en")
    @Expose
    private String catEn;

    @SerializedName("cat_si")
    @Expose
    private String catSi;

    @SerializedName("cat_ta")
    @Expose
    private String catTa;

    @SerializedName("cat_icon")
    @Expose
    private String catIcon;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("subcategories")
    @Expose
    private List<Subcategory> subcategories = null;

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

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }
}
