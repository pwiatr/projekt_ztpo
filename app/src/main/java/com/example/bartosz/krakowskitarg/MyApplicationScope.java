package com.example.bartosz.krakowskitarg;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Bartosz on 26.03.2017.
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface MyApplicationScope {
}
