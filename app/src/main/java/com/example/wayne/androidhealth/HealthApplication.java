package com.example.wayne.androidhealth;

import android.app.Application;

import com.facebook.stetho.Stetho;

import org.xutils.x;

/**
 * Created by steve_000 on 2016/8/15.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth
 */
public class HealthApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        Stetho.initializeWithDefaults(this);
    }
}
