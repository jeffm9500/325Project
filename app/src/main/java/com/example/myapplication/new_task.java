package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Arrays;

public class new_task extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, AdapterView.OnItemSelectedListener{
    TextView mDisplayDate;
    //private DatePickerDialog.OnDateSetListener mDateSetListener;
    Calendar cal;
    DatePickerDialog dpd;
    EditText taskNameInputText;
    EditText taskDescriptionInputText;
    EditText taskTypeInputText;
    Spinner assigneeInputSpinner;
    Spinner frequencyInputSpinner;
    TextView dateInputText;

    ArrayList<String> updated_house_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        taskNameInputText = findViewById(R.id.taskNameInput);
        taskDescriptionInputText = findViewById(R.id.DescriptionInput);
        taskTypeInputText = findViewById(R.id.TypeInput);
        //assigneeInputText = findViewById(R.id.assigneeInput);
        frequencyInputSpinner = findViewById(R.id.frequencySelector);
        mDisplayDate = findViewById(R.id.dateInput);


        mDisplayDate = (TextView) findViewById(R.id.dateInput);
        assigneeInputSpinner = (Spinner) findViewById(R.id.assigneeInput);
        assigneeInputSpinner.setOnItemSelectedListener(this);

        //(getResources().getStringArray(R.array.house_list));
        //updated_house_list.add("Jeff");

        updated_house_list.add("Jeff");
        updated_house_list.add("Alex");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, updated_house_list);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        assigneeInputSpinner.setAdapter(spinnerAdapter);
        spinnerAdapter.notifyDataSetChanged();



        findViewById(R.id.dateInputBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

    }
    public void toMain(View v) {

        Intent i = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();

        extras.putString("PREVIOUS_ACTIVITY", "new_task");
        extras.putString("CHORE_NAME", taskNameInputText.getText().toString());
        extras.putString("CHORE_DESCRIPTION", taskDescriptionInputText.getText().toString());
        extras.putString("CHORE_TYPE", taskTypeInputText.getText().toString());
        extras.putString("CHORE_FREQUENCY", frequencyInputSpinner.getSelectedItem().toString());
        extras.putString("CHORE_ASSIGNEE", String.valueOf(assigneeInputSpinner.getSelectedItemPosition()));
        extras.putString("CHORE_DATE", mDisplayDate.getText().toString());


        i.putExtras(extras);
        startActivity(i);
    }

    private void showDatePickerDialog(){
        cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        dpd = new DatePickerDialog(
                this,
                this, year, month, day
        );
        dpd.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        month = month + 1;
        String date = month + "/" + day + "/" + year;
        mDisplayDate.setText(date);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String item = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
