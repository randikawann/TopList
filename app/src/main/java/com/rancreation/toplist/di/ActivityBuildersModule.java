package com.rancreation.toplist.di;



import com.rancreation.toplist.ui.splash.SplashActivity;
import com.rancreation.toplist.di.auth.AuthModule;
import com.rancreation.toplist.di.auth.AuthViewModelsModule;
import com.rancreation.toplist.di.splash.SplashModule;
import com.rancreation.toplist.di.splash.SplashViewModelsModule;
import com.rancreation.toplist.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Randika Wanninayaka on 2021-12-13.
 */
@Module
public abstract class ActivityBuildersModule { // only put activity decorations

    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class,
                    AuthModule.class
            }
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(
            modules = {
                    SplashViewModelsModule.class,
                    SplashModule.class
            }
    )
    abstract SplashActivity contributeSplashActivity();


}
