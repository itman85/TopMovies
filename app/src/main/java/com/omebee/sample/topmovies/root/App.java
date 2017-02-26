package com.omebee.sample.topmovies.root;

import android.app.Application;

import com.omebee.sample.topmovies.http.ApiModuleForInfo;
import com.omebee.sample.topmovies.http.ApiModuleForName;
import com.omebee.sample.topmovies.topmovies.TopMoviesModule;


public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
