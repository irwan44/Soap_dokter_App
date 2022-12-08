package com.example.soap_app_d_medis;

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

public class MainMedicalRecord extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_medical_record);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }



    }
    public void pasienMR (View view) {
        Intent i = new Intent(MainMedicalRecord.this, MainDetailMR.class);
        startActivity(i);
    }

    public void medical (View view) {
        Intent i = new Intent(MainMedicalRecord.this, MainDetailMR.class);
        startActivity(i);
    }
    public void back1 (View view) {
        Intent i = new Intent( MainMedicalRecord.this, MainActivity.class);
        startActivity(i);
    }
    public void selesai (View view) {
        Intent i = new Intent( MainMedicalRecord.this, MainListMRSelesai.class);
        startActivity(i);
    }
    public void pending (View view) {
        Intent i = new Intent( MainMedicalRecord.this, MainListMRPending.class);
        startActivity(i);
    }

}