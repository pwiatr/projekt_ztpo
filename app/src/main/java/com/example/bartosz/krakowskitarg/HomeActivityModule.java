package com.example.bartosz.krakowskitarg;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bartosz on 26.03.2017.
 */


@Module
public class HomeActivityModule {

    private MainActivity homeActivity;
    public String abc;

    public HomeActivityModule(MainActivity homeActivity) {
        this.homeActivity = homeActivity;
    }

    @Provides
    @HomeActivityScope
    public MainActivity homeActivity() {
        return homeActivity;
    }


}
