package com.example.soap_app_d_medis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    public void medical (View view) {
        Intent i = new Intent(Home.this, MainMedicalRecord.class);
        startActivity(i);
    }
    public void historyantrian (View view) {
        Intent i = new Intent(Home.this, MainMedicalRecord.class);
        startActivity(i);
    }
    public void antrianpasien (View view) {
        Intent i = new Intent(Home.this, MainAntrian.class);
        startActivity(i);
    }
    public void pendapatanpasien (View view) {
        Intent i = new Intent(Home.this, MainPendapatan.class);
        startActivity(i);
    }
    public void gantipassword (View view) {
        Intent i = new Intent(Home.this, MainLupaPassword.class);
        startActivity(i);
    }
    public void informasi (View view) {
        Intent i = new Intent(Home.this, MainInformasion.class);
        startActivity(i);
    }
    public void edit (View view) {
        Intent i = new Intent( Home.this, MainEditProfile.class);
        startActivity(i);
    }

}