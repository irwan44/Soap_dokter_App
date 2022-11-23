package com.example.soap_app_d_medis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainMedicalRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_medical_record);
        getSupportActionBar().hide();

    }
    public void pasienMR (View view) {
        Intent i = new Intent(MainMedicalRecord.this, MainDetailMR.class);
        startActivity(i);
    }

}