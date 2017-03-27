package com.example.bartosz.krakowskitarg;

import dagger.Component;

@HomeActivityScope
@Component(modules = HomeActivityModule.class, dependencies = MyApplicationComponent.class)
public interface HomeActivityComponent {

    void injectHomeActivity(MainActivity homeActivity);
}
