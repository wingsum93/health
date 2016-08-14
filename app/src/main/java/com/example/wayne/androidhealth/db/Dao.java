package com.example.wayne.androidhealth.db;

import android.util.Log;

import com.example.wayne.androidhealth.db.model.AbsorbeCalories;
import com.example.wayne.androidhealth.db.model.ConsumeCalories;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steve_000 on 2016/8/15.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.db.model
 */
public class Dao implements DaoAbs {

    private static DaoAbs mInstance;
    private DbManager.DaoConfig daoConfig;
    private String t = "MyDao";

    public Dao(){
        daoConfig = new DbManager.DaoConfig()
                .setDbName("wms_db")//创建数据库的名称
                .setAllowTransaction(false)
                .setDbVersion(Constant.DB_VERSION)//数据库版本号
                .setDbUpgradeListener(new MyDbUpgradeListener());//数据库更新操作
    }

    public static DaoAbs getInstance() {
        if (mInstance == null) {
            synchronized (Dao.class) {
                if (mInstance == null) {
                    mInstance = new Dao();
                }
            }
        }
        return mInstance;
    }
    public DbManager getDbManager(){
        return x.getDb(daoConfig);
    }




    /**     method  **/
    @Override
    public List<AbsorbeCalories> getAllAbsCar(){
        try {
            List<AbsorbeCalories> photos = getDbManager().selector(AbsorbeCalories.class).findAll();
            if(photos == null)
                return new ArrayList<>();
            return photos;
        } catch (DbException e) {
            Log.w(t,e.getCause());
            return new ArrayList<>();
        }
    }

    @Override
    public List<ConsumeCalories> getAllComsumeCar(){
        try {
            List<ConsumeCalories> photos = getDbManager().selector(ConsumeCalories.class).findAll();
            if(photos == null)
                return new ArrayList<>();
            return photos;
        } catch (DbException e) {
            Log.w(t,e.getCause());
            return new ArrayList<>();
        }
    }
}
