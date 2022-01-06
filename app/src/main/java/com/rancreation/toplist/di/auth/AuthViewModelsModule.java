package com.rancreation.toplist.di.auth;

import androidx.lifecycle.ViewModel;


import com.rancreation.toplist.di.ViewModelKey;
import com.rancreation.toplist.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);
}
