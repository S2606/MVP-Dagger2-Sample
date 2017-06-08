package com.android.mvp_dagger;

import android.app.Application;

import com.android.mvp_dagger.data.component.DaggerNetComponent;
import com.android.mvp_dagger.data.component.NetComponent;
import com.android.mvp_dagger.data.module.AppModule;
import com.android.mvp_dagger.data.module.NetModule;

/**
 * Created by Shagun on 03/06/2017.
 */

public class app extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
