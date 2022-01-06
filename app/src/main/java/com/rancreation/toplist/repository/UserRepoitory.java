package com.rancreation.toplist.repository;



import com.rancreation.toplist.models.User;
import com.rancreation.toplist.network.auth.AuthApi;
import com.rancreation.toplist.network.splash.SplashApi;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by Randika Wanninayaka on 2021-12-16.
 */
public class UserRepoitory {
    private AuthApi authApi;
    @Inject
    public UserRepoitory(AuthApi authApi) {
        this.authApi = authApi;
    }

    public Flowable<User> getUser(int i){
        return authApi.getUser(i);
    }
}
