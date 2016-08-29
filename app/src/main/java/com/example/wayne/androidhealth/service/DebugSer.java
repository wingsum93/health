package com.example.wayne.androidhealth.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by steve_000 on 2016/8/30.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.service
 */
public class DebugSer  extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public class MyBinder extends Binder{
        public DebugSer getService(){
            return DebugSer.this;
        }

    }

    //normal method as act


}
