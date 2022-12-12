package com.example.soap_app_d_medis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainSOAP extends AppCompatActivity {

    String val_token, soap_selesai, soap_pending, soap_total;
    TextView txt_soap_selesai, txt_soap_pending, txt_soap_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_soap);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        txt_soap_selesai = findViewById(R.id.txt_soap_selesai);
        txt_soap_pending = findViewById(R.id.txt_soap_pending);
        txt_soap_total = findViewById(R.id.txt_soap_total);

    }

    private void getDataSoap(){

    }

    public void soapmenu (View view) {
        Intent i = new Intent(MainSOAP.this, MainSOAPMenu.class);
        startActivity(i);
    }
    public void back3 (View view) {
        Intent i = new Intent( MainSOAP.this, MainActivity.class);
        startActivity(i);
    }
//    public void selesaisoap (View view) {
//        Intent i = new Intent( MainSOAP.this, MainListMRSelesai.class);
//        startActivity(i);
//    }
//    public void pendingsoap (View view) {
//        Intent i = new Intent( MainSOAP.this, MainListMRPending.class);
//        startActivity(i);
//    }
}