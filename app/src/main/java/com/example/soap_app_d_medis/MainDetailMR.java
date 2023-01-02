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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainDetailMR extends AppCompatActivity {
    AppCompatButton btn_RiwayatPasien;
    LinearLayout personalinfo, experience, review;
    TextView personalinfobtn, experiencebtn, reviewbtn;
    //Dialog Confirm
    AlertDialog.Builder dial_builder;
    AlertDialog dial_riwayat;
    LayoutInflater inflater;
    View dialogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_medical_record_pasien2);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        personalinfo = findViewById(R.id.personalinfo);
        experience = findViewById(R.id.experience);
        review = findViewById(R.id.review);
        personalinfobtn = findViewById(R.id.personalinfobtn);
        experiencebtn = findViewById(R.id.experiencebtn);
        reviewbtn = findViewById(R.id.reviewbtn);
        /*making personal info visible*/
        personalinfo.setVisibility(View.VISIBLE);
        experience.setVisibility(View.GONE);
        review.setVisibility(View.GONE);


        personalinfobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.VISIBLE);
                experience.setVisibility(View.GONE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.green));
                experiencebtn.setTextColor(getResources().getColor(R.color.gray));
                reviewbtn.setTextColor(getResources().getColor(R.color.gray));

            }
        });

        experiencebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                experience.setVisibility(View.VISIBLE);
                review.setVisibility(View.GONE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.gray));
                experiencebtn.setTextColor(getResources().getColor(R.color.green));
                reviewbtn.setTextColor(getResources().getColor(R.color.gray));

            }
        });

        reviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personalinfo.setVisibility(View.GONE);
                experience.setVisibility(View.GONE);
                review.setVisibility(View.VISIBLE);
                personalinfobtn.setTextColor(getResources().getColor(R.color.gray));
                experiencebtn.setTextColor(getResources().getColor(R.color.gray));
                reviewbtn.setTextColor(getResources().getColor(R.color.green));

            }
        });


//        btn_RiwayatPasien      = findViewById(R.id.btn_RiwayatPasien);

//        dial_builder = new AlertDialog.Builder(MainDetailMR.this,R.style.CustomAlertDialog);
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ViewGroup viewGroup = findViewById(com.google.android.material.R.id.content);
//        inflater = getLayoutInflater();
//        dialogView = inflater.inflate(R.layout.alert_riwayat, viewGroup, false);
////        Button btn_act_tidak = dialogView.findViewById(R.id.btn_cancel);
////        Button btn_act_ya = dialogView.findViewById(R.id.btn_ok);
//        Button btn_act_cancel = dialogView.findViewById(R.id.btn_cancel);
//        dial_builder.setView(dialogView);
//        dial_riwayat = dial_builder.create();
//        dial_riwayat.setCancelable(false);
//        //setOnclick listener
//
//        btn_RiwayatPasien .setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                dial_riwayat.show();
//            }
//        });
//
////        btn_act_ya.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                dial_riwayat.dismiss();
////            }
////        });
////
//        btn_act_cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dial_riwayat.dismiss();
//            }
//        });
////
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