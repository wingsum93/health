package com.example.wayne.androidhealth.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.wayne.androidhealth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by steve_000 on 2016/8/21.
 * for project anroidHealth
 * package name com.example.wayne.androidhealth.activity
 */
public class ShowPhotoActivity extends Activity {

    @BindView(R.id.listView)protected ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_show_photo);
        ButterKnife.bind(this);
        setMyView();
    }

    private void setMyView() {

    }
}
