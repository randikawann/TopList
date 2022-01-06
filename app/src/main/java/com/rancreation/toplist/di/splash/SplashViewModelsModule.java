package com.rancreation.toplist.di.splash;

import androidx.lifecycle.ViewModel;

import com.rancreation.toplist.di.ViewModelKey;
import com.rancreation.toplist.ui.auth.AuthViewModel;
import com.rancreation.toplist.ui.splash.SplashViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
@Module
public abstract class SplashViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel.class)
    public abstract ViewModel bindSplashViewModel(SplashViewModel SplashViewModel);
}
