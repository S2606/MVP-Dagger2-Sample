package com.android.mvp_dagger.data.module;

import com.android.mvp_dagger.mainscreen.MainScreenContract;
import com.android.mvp_dagger.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shagun on 04/06/2017.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
