package com.rancreation.toplist.di.database;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;

import com.rancreation.toplist.data.CategoryDao;
import com.rancreation.toplist.data.TopListDatabase;
import com.rancreation.toplist.network.splash.SplashApi;
import com.rancreation.toplist.repository.SplashRepoitory;
import com.rancreation.toplist.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Randika Wanninayaka on 2022-01-07.
 */
@Module
public class RoomModule {

    private final TopListDatabase database;

    @Inject
    SplashApi splashApi;

    public RoomModule(Application application) {
        this.database = Room.databaseBuilder(
                application,
                TopListDatabase.class,
                "ListItem.db"
        ).build();
    }

//    public RoomModule() {
//        this.database = Room.databaseBuilder(
//                null,
//                TopListDatabase.class,
//                "ListItem.db"
//        ).build();
//    }

    @Provides
    @Singleton
    SplashRepoitory provideListItemRepository(CategoryDao listItemDao){
        return new SplashRepoitory(splashApi, listItemDao);
    }

    @Provides
    @Singleton
    CategoryDao provideListItemDao(TopListDatabase database){
        return database.categoryDao();
    }

    @Provides
    @Singleton
    TopListDatabase provideTopListDatabase(Application application){
        return database;
    }

//    @Provides
//    @Singleton
//    ViewModelProvider.Factory provideViewModelFactory(SplashRepoitory repository){
//        return new ViewModelProviderFactory(null,repository);
//    }

}