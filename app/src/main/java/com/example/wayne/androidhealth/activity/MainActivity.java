package com.example.wayne.androidhealth.activity;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.wayne.androidhealth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.content_view) protected TextView contentView;
    @BindView(R.id.drawer_layout) protected DrawerLayout drawerLayout;
    @BindView(R.id.navigation_view) protected NavigationView view;
    @BindView(R.id.toolbar) protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setMyView();



    }

    public void setMyView(){
        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                navigateTo(menuItem);
                drawerLayout.closeDrawers();
                return true;
            }
        });

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle( this, drawerLayout, toolbar, R.string.openDrawer , R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                super .onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super .onDrawerOpened(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
    public void navigateTo(MenuItem menuItem){
        int itemId = menuItem.getItemId();
        switch (itemId){
            case R.id.navigation_item_1:
                contentView.setText(R.string.intro);
                break;
            case R.id.navigation_item_2:
                contentView.setText(R.string.tdee);
                break;
            case R.id.navigation_item_3:
                contentView.setText(menuItem.getTitle());
                break;
            case R.id.navigation_item_4:
                contentView.setText(menuItem.getTitle());
                break;
        }
        menuItem.setChecked(true);
    }
}
