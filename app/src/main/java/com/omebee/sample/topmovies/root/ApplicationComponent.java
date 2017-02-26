package com.omebee.sample.topmovies.root;


import com.omebee.sample.topmovies.http.ApiModuleForInfo;
import com.omebee.sample.topmovies.http.ApiModuleForName;
import com.omebee.sample.topmovies.topmovies.TopMoviesActivity;
import com.omebee.sample.topmovies.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}
