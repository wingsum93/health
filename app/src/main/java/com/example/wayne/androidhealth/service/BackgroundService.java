package com.example.wayne.androidhealth.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by steve_000 on 2016/8/30.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.service
 * use to do back ground check , change db
 */
public class BackgroundService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
