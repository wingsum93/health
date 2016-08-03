package com.example.wayne.androidhealth.db.model;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.util.Date;

/**
 * Created by wayne on 18/7/2016.
 */
@Table(name ="ConsumeCalories")
public class ConsumeCalories {
    @Column(name="id",isId = true)
    private int id;

    @Column(name="calories")
    private double calories;

    @Column(name="date")
    private Date date;
}
