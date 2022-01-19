package com.rancreation.toplist.ui.splash;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.rancreation.toplist.R;
import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.room.CategoryEntity;
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



        // Sample output for other Activities
        viewModel.getCategoryFromDataBase().observe(this, new Observer<List<CategoryEntity>>() {
            @Override
            public void onChanged(List<CategoryEntity> categories) {
                for(int i=0; i<categories.size(); i++){
//                    Log.i(TAG, "LIST ITEMS *: "+categories.get(i).getCatId());
                }
            }
        });


        viewModel.getCategoryFromDataBase("4").observe(this, new Observer<List<SubcategoryEntity>>() {
            @Override
            public void onChanged(List<SubcategoryEntity> categories) {
                for(int i=0; i<categories.size(); i++){
//                    Log.i(TAG, "SUB LIST ITEMS*: "+categories.get(i).getCatId());
//                    Log.i(TAG, "SUB LIST ITEMS*: "+categories.get(i).getSubcatEn());
                }
            }
        });

        viewModel.getSubCategoryList().observe(this, new Observer<List<SubcategoryEntity>>() {
            @Override
            public void onChanged(List<SubcategoryEntity> categories) {
                for(int i=0; i<categories.size(); i++){
//                    Log.i(TAG, "SUB LIST ITEMS: "+categories.get(i).getCatId());
//                    Log.i(TAG, "SUB LIST ITEMS: "+categories.get(i).getSubcatEn());
                }
            }
        });
    }
}