package com.example.szerszen.projekt_wyniki_nba;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;

public class LakersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void changeTab(View view){
        TabHost tabHost = findViewById(android.R.id.tabhost);

        switch (view.getId()){
            case R.id.tab1 :
                tabHost.getTabWidget().getChildAt(1).setVisibility(View.GONE);
                break;
            case R.id.tab2 :
                tabHost.getTabWidget().getChildAt(2).setVisibility(View.GONE);
                break;
            case R.id.tab3 :
                tabHost.getTabWidget().getChildAt(3).setVisibility(View.GONE);
                break;

        }

    }
}
