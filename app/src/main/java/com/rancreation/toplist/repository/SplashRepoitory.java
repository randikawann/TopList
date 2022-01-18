package com.rancreation.toplist.repository;



import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.bumptech.glide.load.engine.Resource;
import com.rancreation.toplist.data.CategoryDao;
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
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Randika Wanninayaka on 2021-12-16.
 */
public class SplashRepoitory {
    private SplashApi splashApi;
    private CategoryDao categoryDao;
    private static final String TAG = "SplashRepoitory";

    @Inject
    public SplashRepoitory(SplashApi splashApi, CategoryDao categoryDao){
        this.splashApi = splashApi;
        this.categoryDao = categoryDao;
    }

    public void loadAllData(){
        getCategory()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Category>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<Category> categories) {
                        Log.d(TAG, "1111: "+categories);

                        for(int i=0; i<categories.size();i++){
                            long dc = categoryDao.createNewCategory(categories.get(i));
                            Log.d(TAG,"db number "+dc);
                            Log.d(TAG,categories.get(i).getCatEn());
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError: "+e);
                    }

                    @Override
                    public void onComplete() {
                        getCategoryFromDataBase();
                    }
                });
    }

    public Flowable<List<Category>> getCategory(){

        return splashApi.getCategory();
    }

//    public Flowable<List<District>> getDistrict(){
//        return splashApi.getDistrict();
//    }
//
//    public Flowable<List<AdMarketProperty>> getHomeMarket(){
//        return splashApi.getHomeMarket();
//    }
//    public Flowable<List<AdMarketProperty>> getHomeProperty(){
//        return splashApi.getHomeProperty();
//    }
//    public Flowable<List<AdMarketProperty>> getHomeService(){
//        return splashApi.getHomeService();
//    }


    public LiveData<List<Category>> getCategoryFromDataBase(){

        return categoryDao.getCategoryList();

    }




}
