package com.rancreation.toplist.models.retrofit;


import android.graphics.Bitmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AdMarketProperty implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("ads_type")
    @Expose
    private String adsType;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("approve_time")
    @Expose
    private String approveTime;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("cat")
    @Expose
    private String cat;
    @SerializedName("subcat")
    @Expose
    private String subcat;
    @SerializedName("dist_en")
    @Expose
    private String distEn;
    @SerializedName("city_en")
    @Expose
    private String cityEn;
    @SerializedName("classified_type")
    @Expose
    private String classifiedType;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("ad_image_bitmap")
    @Expose
    private Bitmap admageBitmap = null;
    @SerializedName("sold_status")
    @Expose
    private String soldStatus = "";
    @SerializedName("member_role")
    @Expose
    private String memberRole = "";

    private String rejectedStatus = ""; // rejectedStatus = 1 means rejected ad, rejectedStatus = 2 means pending ad

    private String favouriteStatus = "";



    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    public String getFavouriteStatus() {
        return favouriteStatus;
    }

    public void setFavouriteStatus(String favouriteStatus) {
        this.favouriteStatus = favouriteStatus;
    }

    public Bitmap getAdmageBitmap() {
        return admageBitmap;
    }

    public void setAdmageBitmap(Bitmap admageBitmap) {
        this.admageBitmap = admageBitmap;
    }

    public String getRejectedStatus() {
        return rejectedStatus;
    }

    public void setRejectedStatus(String rejectedStatus) {
        this.rejectedStatus = rejectedStatus;
    }

    public String getSoldStatus() {
        return soldStatus;
    }

    public void setSoldStatus(String soldStatus) {
        this.soldStatus = soldStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAdsType() {
        return adsType;
    }

    public void setAdsType(String adsType) {
        this.adsType = adsType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getSubcat() {
        return subcat;
    }

    public void setSubcat(String subcat) {
        this.subcat = subcat;
    }

    public String getDistEn() {
        return distEn;
    }

    public void setDistEn(String distEn) {
        this.distEn = distEn;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public String getClassifiedType() {
        return classifiedType;
    }

    public void setClassifiedType(String classifiedType) {
        this.classifiedType = classifiedType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
