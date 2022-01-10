package com.rancreation.toplist.ui.splash;

import android.util.Log;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.room.Room;

import com.rancreation.toplist.models.AdMarketProperty;
import com.rancreation.toplist.models.Category;
import com.rancreation.toplist.models.District;
import com.rancreation.toplist.models.User;
import com.rancreation.toplist.repository.SplashRepoitory;
import com.rancreation.toplist.repository.UserRepoitory;
import com.rancreation.toplist.util.Constants;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
public class SplashViewModel extends ViewModel {

    private static final String TAG = "SplashViewModel";

    private final SplashRepoitory splashRepoitory;

    @Inject
    public SplashViewModel(SplashRepoitory splashRepoitory) {
        this.splashRepoitory = splashRepoitory;

        getAllCategory();
//        getAllDistrict();

        //HOmeProperty
//        getHomeMarket();
//        getHomeProperty();
//        getHomeService();

        Log.i(TAG, "CATEGORY LIST "+splashRepoitory.getCategoryList().toString());
    }

    private void getHomeService() {
        splashRepoitory.getHomeService()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<AdMarketProperty>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<AdMarketProperty> districts) {

                        for(int i=0; i<districts.size();i++){
                            Log.d(TAG, "Service "+districts.get(i).getDistEn());

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

    private void getHomeProperty() {
        splashRepoitory.getHomeProperty()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<AdMarketProperty>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<AdMarketProperty> districts) {
                        for(int i=0; i<districts.size();i++){
                            Log.d(TAG, "Property "+districts.get(i).getDistEn());

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

    private void getHomeMarket() {
        splashRepoitory.getHomeMarket()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<AdMarketProperty>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<AdMarketProperty> districts) {

                        for(int i=0; i<districts.size();i++){
                            Log.d(TAG, "Market "+districts.get(i).getDistEn());

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

    private void getAllDistrict() {
        splashRepoitory.getDistrict()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<District>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<District> districts) {

                        for(int i=0; i<districts.size();i++){
                            Log.d(TAG, districts.get(i).getDistEn());

                            for(int j=0; j<districts.get(i).getCities().size();j++){
                                Log.d(TAG, " cities:"+districts.get(i).getCities().get(j).getCityEn());
                            }
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

    public void getAllCategory(){
        splashRepoitory.getCategory()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Category>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<Category> categoryList) {
                        Log.d(TAG, "1111: "+categoryList);
                        for(int i=0; i<categoryList.size();i++){
                            Log.d(TAG,categoryList.get(i).getCatEn());
//                            for(int j=0; j<categoryList.get(i).getSubcategories().size(); j++){
//                                Log.d(TAG, "       Sub: "+categoryList.get(i).getSubcategories().get(j).getSubcatEn());
//                            }
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



}
