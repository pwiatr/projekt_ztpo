package com.example.bartosz.krakowskitarg;

import android.app.Activity;
import android.app.Application;

import com.squareup.picasso.Picasso;

import timber.log.Timber;

public class MyApplication extends Application {

    private MyApplicationComponent component;

    public static MyApplication get(Activity activity) {
        return (MyApplication) activity.getApplication();
    }

    private ApiService githubService;

    private Picasso picasso;

    //   Activity

    //ApiService   picasso

    //retrofit    OkHttp3Downloader

    //gson      okhttp

    //      logger    cache

    //      timber           file

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        component = DaggerMyApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        githubService = component.getGithubService();
//        picasso = component.getPicasso();
    }

    public MyApplicationComponent component() {
        return component;
    }
}