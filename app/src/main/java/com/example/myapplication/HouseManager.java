package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.ui.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class HouseManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_manager);
    }

    public void toMain(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
    public void toBridgette(View v){
        startActivity(new Intent(this, Bridgette.class));
    }
    public void toLogin(View v){
        startActivity(new Intent(this, LoginActivity.class));
    }
}
