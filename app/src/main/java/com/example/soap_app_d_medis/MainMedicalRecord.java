package com.example.soap_app_d_medis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

public class MainMedicalRecord extends AppCompatActivity {

    Calendar calendar;
    CalendarView calendarView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_medical_record);
        getSupportActionBar().hide();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }
        calendarView = findViewById(R.id.calendarView);


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                String msg = "Selected date Day: " + i2 + " Month : " + (i1 + 1) + " Year " + i;
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();


            }
        });


    }
    public void pasienMR (View view) {
        Intent i = new Intent(MainMedicalRecord.this, MainDetailMR.class);
        startActivity(i);
    }

    public void medical (View view) {
        Intent i = new Intent(MainMedicalRecord.this, MainDetailMR.class);
        startActivity(i);
    }
    public void medical2 (View view) {
        Intent i = new Intent(MainMedicalRecord.this, MainSOAPMenu.class);
        startActivity(i);
    }
    public void back2 (View view) {
        Intent i = new Intent( MainMedicalRecord.this, Home.class);
        startActivity(i);
    }

    public void pending (View view) {
        Intent i = new Intent( MainMedicalRecord.this, MainListMRPending.class);
        startActivity(i);
    }

}