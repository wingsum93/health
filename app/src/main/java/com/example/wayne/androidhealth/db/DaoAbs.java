package com.example.wayne.androidhealth.db;

import com.example.wayne.androidhealth.db.model.AbsorbeCalories;
import com.example.wayne.androidhealth.db.model.ConsumeCalories;

import java.util.List;

/**
 * Created by steve_000 on 2016/8/15.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.db
 */
public interface DaoAbs {
    //part a
    List<AbsorbeCalories> getAllAbsCar();
    AbsorbeCalories absorbeCalories(String ab);
    List<ConsumeCalories> getAllComsumeCar();


    //part b

}
