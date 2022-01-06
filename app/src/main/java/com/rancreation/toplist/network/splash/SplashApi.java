package com.rancreation.toplist.network.splash;


import com.rancreation.toplist.models.User;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
public interface SplashApi {

    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
