package com.rancreation.toplist.repository;



import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.rancreation.toplist.data.CategoryDao;
import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.room.CategoryEntity;
import com.rancreation.toplist.network.splash.SplashApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
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

                            CategoryEntity categoryentity = new CategoryEntity();
                            categoryentity.setCatId(categories.get(i).getCatId());
                            categoryentity.setCatEn(categories.get(i).getCatEn());
                            categoryentity.setCatSi(categories.get(i).getCatSi());
                            categoryentity.setCatTa(categories.get(i).getCatTa());
                            categoryentity.setCatIcon(categories.get(i).getCatIcon());
                            categoryentity.setType(categories.get(i).getType());

                            long dc = categoryDao.createNewCategory(categoryentity);
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


    public LiveData<List<CategoryEntity>> getCategoryFromDataBase(){

        return categoryDao.getCategoryList();

    }




}
