package com.rancreation.toplist.repository;



import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.rancreation.toplist.data.CategoryDao;
import com.rancreation.toplist.data.DistrictDao;
import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.retrofit.District;
import com.rancreation.toplist.models.room.CategoryEntity;
import com.rancreation.toplist.models.room.CityEntity;
import com.rancreation.toplist.models.room.DistrictEntity;
import com.rancreation.toplist.models.room.SubcategoryEntity;
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
    private DistrictDao districtDao;
    private static final String TAG = "SplashRepoitory";

    @Inject
    public SplashRepoitory(SplashApi splashApi, CategoryDao categoryDao, DistrictDao districtDao){
        this.splashApi = splashApi;
        this.categoryDao = categoryDao;
        this.districtDao = districtDao;
    }

    public void loadAllData(){

//        getRetrofitCategory();
        getRetrofitDistrict();



    }

    private void getRetrofitDistrict() {
        getDistrict()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<District>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<District> districts) {

                        for(int i=0; i<districts.size();i++){

                            DistrictEntity districtEntity = new DistrictEntity();
                            districtEntity.setDistId(districts.get(i).getDistId());
                            districtEntity.setDistEn(districts.get(i).getDistEn());
                            districtEntity.setDistSi(districts.get(i).getDistSi());
                            districtEntity.setDistTa(districts.get(i).getDistTa());

                            Long districtId = districtDao.createNewDistrict(districtEntity);

//                            Log.d(TAG, "DB District value "+districtId);

                            for(int j=0; j<districts.get(i).getCities().size();j++){
                                CityEntity cityEntity = new CityEntity();
                                cityEntity.setDistrictId(districts.get(i).getDistId());
                                cityEntity.setCityId(districts.get(i).getCities().get(j).getCityId());
                                cityEntity.setCityEn(districts.get(i).getCities().get(j).getCityEn());
                                cityEntity.setCitySi(districts.get(i).getCities().get(j).getCitySi());
                                cityEntity.setCityTa(districts.get(i).getCities().get(j).getCityTa());
                                cityEntity.setLat(districts.get(i).getCities().get(j).getLat());
                                cityEntity.setLng(districts.get(i).getCities().get(j).getLng());

                                Long cityid = districtDao.createNewCity(cityEntity);
//                                Log.d(TAG, "DB city value "+cityid);
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

    private void getRetrofitCategory() {
        getCategory()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Category>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<Category> categories) {


                        for(int i=0; i<categories.size();i++){

                            CategoryEntity categoryentity = new CategoryEntity();
                            categoryentity.setCatId(categories.get(i).getCatId());
                            categoryentity.setCatEn(categories.get(i).getCatEn());
                            categoryentity.setCatSi(categories.get(i).getCatSi());
                            categoryentity.setCatTa(categories.get(i).getCatTa());
                            categoryentity.setCatIcon(categories.get(i).getCatIcon());
                            categoryentity.setType(categories.get(i).getType());

                            long catDb = categoryDao.createNewCategory(categoryentity);
//                            Log.d(TAG,"db number "+dc);
//                            Log.d(TAG,categories.get(i).getCatEn());



                            for(int j=0; j<categories.get(i).getSubcategories().size(); j++){

//                                Log.d(TAG,"Sub cat-> cat id" +categories.get(i).getCatId());
//                                Log.d(TAG,"Sub cat id "+categories.get(i).getSubcategories().get(j).getSubcatId());
//                                Log.d(TAG,"sub cat name "+categories.get(i).getSubcategories().get(j).getSubcatEn());

                                SubcategoryEntity subcategoryEntity = new SubcategoryEntity();
                                subcategoryEntity.setSubcatId(categories.get(i).getSubcategories().get(j).getSubcatId());
                                subcategoryEntity.setCatId(categories.get(i).getCatId());
                                subcategoryEntity.setSubcatEn(categories.get(i).getSubcategories().get(j).getSubcatEn());
                                subcategoryEntity.setSubcatSi(categories.get(i).getSubcategories().get(j).getSubcatSi());
                                subcategoryEntity.setSubcatTa(categories.get(i).getSubcategories().get(j).getSubcatTa());
                                subcategoryEntity.setSubcatIcon(categories.get(i).getSubcategories().get(j).getSubcatIcon());

                                long subCatDb = categoryDao.createNewSubCategory(subcategoryEntity);
                                Log.d(TAG,"subCatDb "+subCatDb);
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

    public Flowable<List<Category>> getCategory(){

        return splashApi.getCategory();
    }

    public Flowable<List<District>> getDistrict(){

        return splashApi.getDistrict();
    }

//    public Flowable<List<AdMarketProperty>> getHomeMarket(){
//        return splashApi.getHomeMarket();
//    }
//    public Flowable<List<AdMarketProperty>> getHomeProperty(){
//        return splashApi.getHomeProperty();
//    }
//    public Flowable<List<AdMarketProperty>> getHomeService(){
//        return splashApi.getHomeService();
//    }


    public LiveData<List<CategoryEntity>> getCategoryFromDb(){

        return categoryDao.getCategoryList();

    }

    public LiveData<List<SubcategoryEntity>> getSubCategoryByCatFromDb(String catId){
        return categoryDao.getSubCategoryListByCatId(catId);

    }

    public LiveData<List<SubcategoryEntity>> getSubCategoryListFromDb(){
        return categoryDao.getSubCategoryList();

    }

    public LiveData<List<DistrictEntity>> getDistrictListFromDb(){
        return districtDao.getDistrictList();
    }

    public LiveData<List<CityEntity>> getCityListFromDb(){
        return districtDao.getCityList();
    }

    public LiveData<List<CityEntity>> getCityByDistrictFromDb(String cityId){
        return districtDao.getCityListById(cityId);
    }



}
