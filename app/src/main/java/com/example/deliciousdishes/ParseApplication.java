package com.example.deliciousdishes;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("94BU2R4X6LNrs0jB6aQApdu82BMK2cPzDDOqZzxh")
                .clientKey("p6cOxWfYhfcEF1481fwJyI801RbfSXsnkvIWXRhi")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}