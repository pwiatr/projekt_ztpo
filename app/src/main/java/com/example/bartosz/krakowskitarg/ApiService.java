package com.example.bartosz.krakowskitarg;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Bartosz on 26.03.2017.
 */
public interface ApiService {

    @GET("users/{username}/repos")
    Call<List<GithubRepo>> getReposForUser(@Path("username") String username);

    @GET("repositories")
    Call<List<GithubRepo>> getAllRepos();

    @GET("users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);
}
