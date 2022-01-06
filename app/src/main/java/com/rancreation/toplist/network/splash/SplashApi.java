package com.rancreation.toplist.network.splash;


import androidx.constraintlayout.helper.widget.Flow;

import com.rancreation.toplist.models.AdMarketProperty;
import com.rancreation.toplist.models.Category;
import com.rancreation.toplist.models.District;
import com.rancreation.toplist.models.User;
import com.rancreation.toplist.util.Constants;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
public interface SplashApi {

    @GET("v1/get_cat_subcat")
    Flowable<List<Category>> getCategory();

    @GET("v1/get_dist_city")
    Flowable<List<District>> getDistrict();

    @GET("v1/get_market_ads_home?pagest=1&pageed=20")
    Flowable<List<AdMarketProperty>> getHomeMarket();

    @GET("v1/get_property_ads_home?pagest=1&pageed=20")
    Flowable<List<AdMarketProperty>> getHomeProperty();

    @GET("v1/get_services_ads_home?pagest=1&pageed=20")
    Flowable<List<AdMarketProperty>> getHomeService();

}
