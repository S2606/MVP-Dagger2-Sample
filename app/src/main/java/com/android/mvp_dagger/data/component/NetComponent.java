package com.android.mvp_dagger.data.component;

import com.android.mvp_dagger.data.module.AppModule;
import com.android.mvp_dagger.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Shagun on 03/06/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}