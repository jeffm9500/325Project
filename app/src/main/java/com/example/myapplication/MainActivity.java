package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void testMethod(View v){
        startActivity(new Intent(this, HouseManager.class));
    }

    public void toHouseManager(View v){
        startActivity(new Intent(this, HouseManager.class));
    }
    public void toCalendar(View v){
        startActivity(new Intent(this, activity_calendar.class));
    }
    public void toAll(View v){
        startActivity(new Intent(this, main_all.class));
    }

}
