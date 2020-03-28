package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.login.LoginActivity;

public class login_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }
    public void toJoin(View v){
        startActivity(new Intent(this, join_house.class));
    }
    public void toNew(View v){
        startActivity(new Intent(this, create_house.class));
    }
    public void toLogin(View v){
        startActivity(new Intent(this, LoginActivity.class));
    }


}
