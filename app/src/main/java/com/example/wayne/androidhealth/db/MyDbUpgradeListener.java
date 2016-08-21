package com.example.wayne.androidhealth.db;

import org.xutils.DbManager;

/**
 * Created by steve_000 on 2016/8/15.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.db
 */
public class MyDbUpgradeListener implements DbManager.DbUpgradeListener {
    @Override
    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
        if(newVersion>1){
            
        }
    }
}
