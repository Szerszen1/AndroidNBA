package com.example.szerszen.projekt_wyniki_nba;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void changePage(View view){
        switch (view.getId()){
            case R.id.lakers :
                Intent la = new Intent(MainActivity.this, LakersActivity.class);
                startActivity(la);
                break;
            case R.id.thunder :
                Intent oct = new Intent(MainActivity.this, ThunderActivity.class);
                startActivity(oct);
                break;
            case R.id.warriors :
                Intent gs = new Intent(MainActivity.this, WarriorsActivity.class);
                startActivity(gs);
                break;
            case R.id.rockets :
                Intent hou = new Intent(MainActivity.this, HoustonActivity.class);
                startActivity(hou);
                break;

        }
    }
}
