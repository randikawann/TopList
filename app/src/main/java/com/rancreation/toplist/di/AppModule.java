package com.rancreation.toplist.di;

import android.app.Application;
import androidx.room.Room;
import com.rancreation.toplist.data.CategoryDao;
import com.rancreation.toplist.data.DistrictDao;
import com.rancreation.toplist.data.TopListDatabase;
import com.rancreation.toplist.util.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Randika Wanninayaka on 2021-12-13.
 */
@Module
public class AppModule {
    // put all the all the application dependencies the project
    // Ex: Retrofit, Glide

//    @Provides
//    @Singleton
//    OkHttpClient provideOkHttpClient() {
//        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
//        okHttpClient.connectTimeout(ApiConstants.CONNECT_TIMEOUT, TimeUnit.MILLISECONDS);
//        okHttpClient.readTimeout(ApiConstants.READ_TIMEOUT, TimeUnit.MILLISECONDS);
//        okHttpClient.writeTimeout(ApiConstants.WRITE_TIMEOUT, TimeUnit.MILLISECONDS);
//        okHttpClient.addInterceptor(new RequestInterceptor());
//        okHttpClient.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
//        return okHttpClient.build();
//    }

    @Singleton
    @Provides
    static Retrofit provideRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    TopListDatabase provideArticleDatabase(Application application) {
        return Room.databaseBuilder(application, TopListDatabase.class, "ListItem.db").build();
    }

    @Provides
    @Singleton
    CategoryDao provideArticleDao(TopListDatabase topListDatabase) {
        return topListDatabase.categoryDao();
    }

    @Provides
    @Singleton
    DistrictDao provideArticleDistrictDao(TopListDatabase topListDatabase) {
        return topListDatabase.districtDao();
    }

}
