package com.rancreation.toplist.network.splash;


import com.rancreation.toplist.models.retrofit.AdMarketProperty;
import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.retrofit.District;
import com.rancreation.toplist.util.Constants;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
public interface SplashApi {

    @GET(Constants.CATEGORY_PART)
    Flowable<List<Category>> getCategory();

    @GET(Constants.DISTRICT_PART)
    Flowable<List<District>> getDistrict();

    @GET(Constants.MARKET_HOME_PART+Constants.PAGE_BETWEEN_PART)
    Flowable<List<AdMarketProperty>> getHomeMarket();

    @GET(Constants.PROPERTY_HOME_PART+Constants.PAGE_BETWEEN_PART)
    Flowable<List<AdMarketProperty>> getHomeProperty();

    @GET(Constants.SERVICE_HOME_PART+Constants.PAGE_BETWEEN_PART)
    Flowable<List<AdMarketProperty>> getHomeService();

}
