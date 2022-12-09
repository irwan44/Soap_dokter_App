package com.example.soap_app_d_medis;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.soap_app_d_medis.swep.Swep_Soap_ICD10;
import com.example.soap_app_d_medis.swep.Swep_Soap_Resep;
import com.example.soap_app_d_medis.swep.Swep_Soap_Rujukan;
import com.example.soap_app_d_medis.swep.Swep_Soap_Tindakan;

public class MainSOAPMenu extends AppCompatActivity {

    LinearLayout btn_detailmr;
    ImageView toolbar1;

    //Dialog Confirm
    AlertDialog.Builder dial_builder;
    AlertDialog dial_riwayat;
    LayoutInflater inflater;
    View dialogView;

    Button btn_RujukanLab;
    RelativeLayout btn_Tindakan, btn_Resep, btn_icd10;


    @SuppressLint("WrongViewCast")
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

        btn_detailmr = findViewById(R.id.btn_detailmr);
//        toolbar = findViewById(R.id.toolbar);

        dial_builder = new AlertDialog.Builder(MainSOAPMenu.this,R.style.CustomAlertDialog);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ViewGroup viewGroup = findViewById(com.google.android.material.R.id.content);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.alert_medical_record, viewGroup, false);
        Button btn_act_cencel = dialogView.findViewById(R.id.btn_cancel);
        Button btn_act_detail = dialogView.findViewById(R.id.btn_detail);
//        Button btn_act_cancel = dialogView.findViewById(R.id.btn_cancel);
        dial_builder.setView(dialogView);
        dial_riwayat = dial_builder.create();
        dial_riwayat.setCancelable(false);
        dial_riwayat.setCanceledOnTouchOutside(false);
        //setOnclick listener

        btn_detailmr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dial_riwayat.show();
            }
        });

        btn_act_cencel .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial_riwayat.dismiss () ; isFinishing();
            }
        });
//
             btn_act_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent i = new Intent(MainSOAPMenu.this, MainDetailMR.class);
                startActivity(i);

            }

        });

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