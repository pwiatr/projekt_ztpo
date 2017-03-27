package com.example.bartosz.krakowskitarg;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bartosz on 26.03.2017.
 */


@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @MyApplicationScope
    @ApplicationContext
    public Context context() {
        return context;
    }
}
