package com.example.soap_app_d_medis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.soap_app_d_medis.swep.Swep_Soap_ICD10;
import com.example.soap_app_d_medis.swep.Swep_Soap_Resep;
import com.example.soap_app_d_medis.swep.Swep_Soap_Rujukan;
import com.example.soap_app_d_medis.swep.Swep_Soap_Tindakan;

public class MainSOAPMenu extends AppCompatActivity {


    Button btn_RujukanLab;
    RelativeLayout btn_Tindakan, btn_Resep, btn_icd10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_soap_menu);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        getSupportActionBar().hide();

        btn_RujukanLab = findViewById(R.id.btn_RujukanLab);
        btn_Tindakan = findViewById(R.id.btn_Tindakan);
        btn_Resep = findViewById(R.id.btn_Resep);
        btn_icd10= findViewById(R.id.btn_ICD);

        btn_RujukanLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Swep_Soap_Rujukan swep_soap_rujukan = new Swep_Soap_Rujukan();
                swep_soap_rujukan.show(getSupportFragmentManager(),"TAG");

            }
        });

        btn_Tindakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Swep_Soap_Tindakan swep_soap_tindakan = new Swep_Soap_Tindakan();
                swep_soap_tindakan.show(getSupportFragmentManager(),"TAG");

            }
        });

        btn_Resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Swep_Soap_Resep swep_soap_resep = new Swep_Soap_Resep();
                swep_soap_resep.show(getSupportFragmentManager(),"TAG");

            }
        });

        btn_icd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Swep_Soap_ICD10 swep_soap_icd10 = new Swep_Soap_ICD10();
                swep_soap_icd10.show(getSupportFragmentManager(),"TAG");

            }
        });

    }

    public void medical (View view) {
        Intent i = new Intent(MainSOAPMenu.this, MainDetailMR.class);
        startActivity(i);
    }
    public void back4 (View view) {
        Intent i = new Intent( MainSOAPMenu.this, MainSOAP.class);
        startActivity(i);
    }
}