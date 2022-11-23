package com.example.soap_app_d_medis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainSOAP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_soap);

        getSupportActionBar().hide();

    }

    public void soapmenu (View view) {
        Intent i = new Intent(MainSOAP.this, MainSOAPMenu.class);
        startActivity(i);
    }
}