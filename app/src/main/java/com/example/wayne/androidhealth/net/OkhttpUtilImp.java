package com.example.wayne.androidhealth.net;


import com.facebook.stetho.okhttp3.StethoInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by steve_000 on 2016/8/30.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.net
 */
public class OkhttpUtilImp implements NetworkUtil {
    private static NetworkUtil mInstance;
    private OkHttpClient client;
    public OkhttpUtilImp(){
        client = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS).build();
    }
    public static void getInstance(){
        synchronized (mInstance){
            if(mInstance==null){
                mInstance = new OkhttpUtilImp();
            }
        }
    }


}
