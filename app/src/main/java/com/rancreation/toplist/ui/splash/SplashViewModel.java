package com.rancreation.toplist.ui.splash;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.rancreation.toplist.models.User;
import com.rancreation.toplist.repository.SplashRepoitory;
import com.rancreation.toplist.repository.UserRepoitory;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Randika Wanninayaka on 2021-12-14.
 */
public class SplashViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final SplashRepoitory splashRepoitory;

    @Inject
    public SplashViewModel(SplashRepoitory splashRepoitory) {
        this.splashRepoitory = splashRepoitory;

        splashRepoitory.getUser(3)
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull User user) {
                        Log.d(TAG, "onNext: "+user.getEmail());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d(TAG, "onError: "+e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
