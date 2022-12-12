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

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainDetailMR extends AppCompatActivity {
    AppCompatButton btn_RiwayatPasien;

    //Dialog Confirm
    AlertDialog.Builder dial_builder;
    AlertDialog dial_riwayat;
    LayoutInflater inflater;
    View dialogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_medical_record_pasien);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        btn_RiwayatPasien      = findViewById(R.id.btn_RiwayatPasien);

        dial_builder = new AlertDialog.Builder(MainDetailMR.this,R.style.CustomAlertDialog);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ViewGroup viewGroup = findViewById(com.google.android.material.R.id.content);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.alert_riwayat, viewGroup, false);
//        Button btn_act_tidak = dialogView.findViewById(R.id.btn_cancel);
//        Button btn_act_ya = dialogView.findViewById(R.id.btn_ok);
        Button btn_act_cancel = dialogView.findViewById(R.id.btn_cancel);
        dial_builder.setView(dialogView);
        dial_riwayat = dial_builder.create();
        dial_riwayat.setCancelable(false);
        //setOnclick listener

        btn_RiwayatPasien .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dial_riwayat.show();
            }
        });

//        btn_act_ya.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dial_riwayat.dismiss();
//            }
//        });
//
        btn_act_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial_riwayat.dismiss();
            }
        });
//
    }
    public void gosoap (View view) {
        Intent i = new Intent(MainDetailMR.this, MainSOAPMenu.class);
        startActivity(i);
    }
    public void back2 (View view) {
        Intent i = new Intent( MainDetailMR.this, MainMedicalRecord.class);
        startActivity(i);
    }
}