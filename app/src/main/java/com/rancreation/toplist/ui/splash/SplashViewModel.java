package com.rancreation.toplist.ui.splash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.repository.SplashRepoitory;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
public class SplashViewModel extends ViewModel {

    private static final String TAG = "SplashViewModel";

    private final SplashRepoitory splashRepoitory;

    @Inject
    public SplashViewModel(SplashRepoitory splashRepoitory) {
        this.splashRepoitory = splashRepoitory;

        loadAllData();


//        getAllDistrict();

        //HOmeProperty
//        getHomeMarket();
//        getHomeProperty();
//        getHomeService();
    }

//    private void getHomeService() {
//        splashRepoitory.getHomeService()
//                .toObservable()
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Observer<List<AdMarketProperty>>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(@NonNull List<AdMarketProperty> districts) {
//
//                        for(int i=0; i<districts.size();i++){
//                            Log.d(TAG, "Service "+districts.get(i).getDistEn());
//
//                        }
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        Log.d(TAG, "onError: "+e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }

//    private void getHomeProperty() {
//        splashRepoitory.getHomeProperty()
//                .toObservable()
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Observer<List<AdMarketProperty>>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(@NonNull List<AdMarketProperty> districts) {
//                        for(int i=0; i<districts.size();i++){
//                            Log.d(TAG, "Property "+districts.get(i).getDistEn());
//
//                        }
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        Log.d(TAG, "onError: "+e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }

//    private void getHomeMarket() {
//        splashRepoitory.getHomeMarket()
//                .toObservable()
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Observer<List<AdMarketProperty>>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(@NonNull List<AdMarketProperty> districts) {
//
//                        for(int i=0; i<districts.size();i++){
//                            Log.d(TAG, "Market "+districts.get(i).getDistEn());
//
//                        }
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        Log.d(TAG, "onError: "+e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }

//    private void getAllDistrict() {
//        splashRepoitory.getDistrict()
//                .toObservable()
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Observer<List<District>>() {
//                    @Override
//                    public void onSubscribe(@NonNull Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(@NonNull List<District> districts) {
//
//                        for(int i=0; i<districts.size();i++){
//                            Log.d(TAG, districts.get(i).getDistEn());
//
//                            for(int j=0; j<districts.get(i).getCities().size();j++){
//                                Log.d(TAG, " cities:"+districts.get(i).getCities().get(j).getCityEn());
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void onError(@NonNull Throwable e) {
//                        Log.d(TAG, "onError: "+e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }

    public void loadAllData(){
        splashRepoitory.loadAllData();

    }

    public LiveData<List<Category>> getCategoryFromDataBase(){
        return splashRepoitory.getCategoryFromDataBase();
    }



}
