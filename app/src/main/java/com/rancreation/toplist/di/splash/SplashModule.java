package com.rancreation.toplist.di.splash;



import com.rancreation.toplist.network.splash.SplashApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
@Module
public class SplashModule {
    @Provides
    static SplashApi provideSplashApi(Retrofit retrofit){
        return retrofit.create(SplashApi.class);
    }
}
