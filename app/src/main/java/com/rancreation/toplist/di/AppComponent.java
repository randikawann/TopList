package com.rancreation.toplist.di;

import android.app.Application;

import com.rancreation.toplist.BaseApplication;
import com.rancreation.toplist.di.database.RoomModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Randika Wanninayaka on 2021-12-13.
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class,
                RoomModule.class}
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

//        @BindsInstance
        Builder roomModule(RoomModule roomModule);


        AppComponent build();
    }

}
