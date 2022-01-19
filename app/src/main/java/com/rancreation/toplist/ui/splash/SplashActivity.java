package com.rancreation.toplist.ui.splash;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.rancreation.toplist.R;
import com.rancreation.toplist.models.retrofit.Category;
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


        viewModel.getCategoryFromDataBase().observe(this, new Observer<List<Category>>() {
            @Override
            public void onChanged(List<Category> categories) {
                for(int i=0; i<categories.size(); i++){
                    Log.i(TAG, "LIST ITEMS *: "+categories.get(i).getCatId());
                }
            }
        });
    }
}