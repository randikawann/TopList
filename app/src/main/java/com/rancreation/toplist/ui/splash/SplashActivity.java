package com.rancreation.toplist.ui.splash;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.rancreation.toplist.R;
import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.room.CategoryEntity;
import com.rancreation.toplist.models.room.CityEntity;
import com.rancreation.toplist.models.room.DistrictEntity;
import com.rancreation.toplist.models.room.HomeAdsEntity;
import com.rancreation.toplist.models.room.SubcategoryEntity;
import com.rancreation.toplist.viewmodels.ViewModelProviderFactory;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class SplashActivity extends DaggerAppCompatActivity {

    private static final String TAG = "SplashActivity";

    SplashViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        viewModel = ViewModelProviders.of(this, providerFactory).get(SplashViewModel.class);



        // Sample output for other Activities ---------------------

        viewModel.getCategoryFromDb().observe(this, new Observer<List<CategoryEntity>>() {
            @Override
            public void onChanged(List<CategoryEntity> categories) {
                for(int i=0; i<categories.size(); i++){

                }
            }
        });


        viewModel.getSubCategoryByCatFromDb("4").observe(this, new Observer<List<SubcategoryEntity>>() {
            @Override
            public void onChanged(List<SubcategoryEntity> categories) {
                for(int i=0; i<categories.size(); i++){

                }
            }
        });

        viewModel.getSubCategoryListFromDb().observe(this, new Observer<List<SubcategoryEntity>>() {
            @Override
            public void onChanged(List<SubcategoryEntity> categories) {
                for(int i=0; i<categories.size(); i++){

                }
            }
        });

        viewModel.getDistrictListFromDb().observe(this, new Observer<List<DistrictEntity>>() {
            @Override
            public void onChanged(List<DistrictEntity> districts) {
                for(int i=0; i<districts.size(); i++){

                }
            }
        });

        viewModel.getCityListFromDb().observe(this, new Observer<List<CityEntity>>() {
            @Override
            public void onChanged(List<CityEntity> cities) {
                for(int i=0; i<cities.size(); i++){

                }
            }
        });


        viewModel.getCityByDistrictFromDb("6").observe(this, new Observer<List<CityEntity>>() {
            @Override
            public void onChanged(List<CityEntity> cities) {
                for(int i=0; i<cities.size(); i++){

                }
            }
        });

        viewModel.getHomeAllAdsFromDb().observe(this, new Observer<List<HomeAdsEntity>>() {
            @Override
            public void onChanged(List<HomeAdsEntity> homeads) {
                for(int i=0; i<homeads.size(); i++){

                }
            }
        });

        // "market", "property", "services"
        viewModel.getCategoryListByTypeFromDb("services").observe(this, new Observer<List<HomeAdsEntity>>() {
            @Override
            public void onChanged(List<HomeAdsEntity> homeads) {
                for(int i=0; i<homeads.size(); i++){

                }
            }
        });

        // -----------------------------------------------------------
    }
}