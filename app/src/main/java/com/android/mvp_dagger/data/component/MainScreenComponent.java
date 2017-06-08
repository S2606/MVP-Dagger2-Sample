package com.android.mvp_dagger.data.component;

import com.android.mvp_dagger.data.module.MainScreenModule;
import com.android.mvp_dagger.mainscreen.MainActivity;
import com.android.mvp_dagger.util.CustomScope;

import dagger.Component;

/**
 * Created by Shagun on 04/06/2017.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
