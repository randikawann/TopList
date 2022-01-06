package com.rancreation.toplist.di;

import androidx.lifecycle.ViewModelProvider;


import com.rancreation.toplist.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);

}
