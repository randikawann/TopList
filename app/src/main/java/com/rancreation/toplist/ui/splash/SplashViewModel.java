package com.rancreation.toplist.ui.splash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.room.CategoryEntity;
import com.rancreation.toplist.models.room.CityEntity;
import com.rancreation.toplist.models.room.DistrictEntity;
import com.rancreation.toplist.models.room.HomeAdsEntity;
import com.rancreation.toplist.models.room.SubcategoryEntity;
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

    }


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


    public void loadAllData(){
        splashRepoitory.loadAllData();
    }

    public LiveData<List<CategoryEntity>> getCategoryFromDb(){
        return splashRepoitory.getCategoryFromDb();
    }

    public LiveData<List<SubcategoryEntity>> getSubCategoryByCatFromDb(String catId){
        return splashRepoitory.getSubCategoryByCatFromDb(catId);
    }

    public LiveData<List<SubcategoryEntity>> getSubCategoryListFromDb(){
        return splashRepoitory.getSubCategoryListFromDb();
    }

    public LiveData<List<DistrictEntity>> getDistrictListFromDb(){
        return splashRepoitory.getDistrictListFromDb();
    }

    public LiveData<List<CityEntity>> getCityListFromDb(){
        return splashRepoitory.getCityListFromDb();
    }

    public LiveData<List<CityEntity>> getCityByDistrictFromDb(String id){
        return splashRepoitory.getCityByDistrictFromDb(id);
    }

    public LiveData<List<HomeAdsEntity>> getHomeAllAdsFromDb(){
        return splashRepoitory.getHomeAllAdsFromDb();
    }

    public LiveData<List<HomeAdsEntity>> getCategoryListByTypeFromDb(String classificationType){
        return splashRepoitory.getCategoryListByTypeFromDb(classificationType);
    }


}
