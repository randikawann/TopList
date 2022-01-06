package com.rancreation.toplist.repository;



import com.rancreation.toplist.models.AdMarketProperty;
import com.rancreation.toplist.models.Category;
import com.rancreation.toplist.models.District;
import com.rancreation.toplist.models.User;
import com.rancreation.toplist.network.auth.AuthApi;
import com.rancreation.toplist.network.splash.SplashApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by Randika Wanninayaka on 2021-12-16.
 */
public class SplashRepoitory {
    private SplashApi splashApi;

    @Inject
    public SplashRepoitory(SplashApi splashApi){
        this.splashApi = splashApi;
    }


    public Flowable<List<Category>> getCategory(){
        return splashApi.getCategory();
    }

    public Flowable<List<District>> getDistrict(){
        return splashApi.getDistrict();
    }

    public Flowable<List<AdMarketProperty>> getHomeMarket(){
        return splashApi.getHomeMarket();
    }
    public Flowable<List<AdMarketProperty>> getHomeProperty(){
        return splashApi.getHomeProperty();
    }
    public Flowable<List<AdMarketProperty>> getHomeService(){
        return splashApi.getHomeService();
    }





}
