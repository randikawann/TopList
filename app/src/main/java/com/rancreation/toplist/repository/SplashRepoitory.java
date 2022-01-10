package com.rancreation.toplist.repository;



import androidx.lifecycle.LiveData;

import com.rancreation.toplist.data.CategoryDao;
import com.rancreation.toplist.models.AdMarketProperty;
import com.rancreation.toplist.models.Category;
import com.rancreation.toplist.models.District;
import com.rancreation.toplist.network.splash.SplashApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by Randika Wanninayaka on 2021-12-16.
 */
public class SplashRepoitory {
    private SplashApi splashApi;
    private final CategoryDao categoryDao;

    @Inject
    public SplashRepoitory(SplashApi splashApi, CategoryDao categoryDao){
        this.splashApi = splashApi;
        this.categoryDao = categoryDao;
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


    //Database
    public LiveData<List<Category>> getCategoryList(){
        return categoryDao.getCategoryList();
    }

    public LiveData<Category> getCategoryListById(String id){
        return categoryDao.getCategoryListById(id);
    }



}
