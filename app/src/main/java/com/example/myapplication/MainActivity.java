package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TableRow.LayoutParams;
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
        //if(!getIntent().getExtras().getString("PREVIOUS_ACTIVITY").equals(null)) {
            Intent i = getIntent();
            Bundle extras = i.getExtras();
            if(extras != null){
            String recent_activity = extras.getString("PREVIOUS_ACTIVITY", "-1");
            if (recent_activity == "new_task") {
                String chore_name = extras.getString("CHORE_NAME", "");
                String chore_description = extras.getString("CHORE_DESCRIPTION", "");
                String chore_type = extras.getString("CHORE_TYPE", "");
                String chore_frequency = extras.getString("CHORE_FREQUENCY", "");
                String chore_assignee = extras.getString("CHORE_ASSIGNEE", "");
                String chore_date = extras.getString("CHORE_DATE", "");
            }
        }



    }

    public void toHouseManager(View v){

        Intent i = new Intent(this, HouseManager.class);
        Bundle extras = new Bundle();
        extras.putString("PREVIOUS_ACTIVITY", "main");
        startActivity(i);
    }
    public void toCalendar(View v){

        Intent i = new Intent(this, activity_calendar.class);
        Bundle extras = new Bundle();
        extras.putString("PREVIOUS_ACTIVITY", "main");
        startActivity(i);
    }
    public void toAll(View v){
        Intent i = new Intent(this, main_all.class);
        Bundle extras = new Bundle();
        extras.putString("PREVIOUS_ACTIVITY", "main");
        startActivity(i);
    }
    public void toNewChore(View v){
        Intent i = new Intent(this, new_task.class);
        Bundle extras = new Bundle();
        extras.putString("PREVIOUS_ACTIVITY", "main");
        startActivity(i);
    }

    public void toProfile(View v){
        Intent i = new Intent(this, profile.class);
        Bundle extras = new Bundle();
        extras.putString("PREVIOUS_ACTIVITY", "main");
        startActivity(i);
    }


}
