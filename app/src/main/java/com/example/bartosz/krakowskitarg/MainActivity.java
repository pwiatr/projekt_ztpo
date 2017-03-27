package com.example.bartosz.krakowskitarg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomeActivityComponent component = DaggerHomeActivityComponent.builder()
                .homeActivityModule(new HomeActivityModule(this))
                .myApplicationComponent(MyApplication.get(this).component())
                .build();
//        Toast.makeText(this, new HomeActivityModule(this).test(), Toast.LENGTH_LONG).show();
        component.injectHomeActivity(this);
    }
}
