package com.example.wayne.androidhealth.db.model;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.util.Date;

/**
 * Created by wayne on 3/8/2016.
 */
@Table(name="AbsorbeCalories")
public class AbsorbeCalories {
    @Column(name="id",isId = true)
    private int id;

    @Column(name="calories")
    private double calories;

    @Column(name="date")
    private Date date;
}
