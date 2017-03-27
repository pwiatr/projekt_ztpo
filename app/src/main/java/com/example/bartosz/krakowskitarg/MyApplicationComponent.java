package com.example.bartosz.krakowskitarg;

/**
 * Created by Bartosz on 26.03.2017.
 */

import dagger.Component;

@MyApplicationScope
@Component(modules = {GithubServiceModule.class})
public interface MyApplicationComponent {

//    Picasso getPicasso();

    ApiService getGithubService();
}
