package com.example.soap_app_d_medis;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.soap_app_d_medis.swep.Swep_Soap_ICD10;
import com.example.soap_app_d_medis.swep.Swep_Soap_Resep;
import com.example.soap_app_d_medis.swep.Swep_Soap_Rujukan;
import com.example.soap_app_d_medis.swep.Swep_Soap_Tindakan;
import com.google.android.material.bottomappbar.BottomAppBar;

public class MainSOAPMenu extends AppCompatActivity {

    Button btn_RujukanLab;
    RelativeLayout btn_Tindakan, btn_Resep, btn_icd10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_soap_menu);

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
}