package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class main_all extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all);
    }

    public void toHouseManager(View v){
        startActivity(new Intent(this, HouseManager.class));
    }
    public void toCalendar(View v){
        startActivity(new Intent(this, activity_calendar.class));
    }
    public void toMain(View v) {
        Intent i = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();
        extras.putString("PREVIOUS_ACTIVITY", "main_all");
        startActivity(i);
    }
    public void toNewChore(View v){
        startActivity(new Intent(this, new_task.class));
    }
    public void toFinishNewChore(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
    public void toProfile(View v){
        startActivity(new Intent(this, profile.class));
    }

}
