package com.rancreation.toplist.repository;



import com.rancreation.toplist.models.User;
import com.rancreation.toplist.network.auth.AuthApi;
import com.rancreation.toplist.network.splash.SplashApi;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by Randika Wanninayaka on 2021-12-16.
 */
public class SplashRepoitory {
    private SplashApi splashApi;

    @Inject
    public SplashRepoitory(SplashApi splashApi){
        this.splashApi = splashApi;
    }
    public Flowable<User> getUser(int i){
        return splashApi.getUser(i);
    }
}
