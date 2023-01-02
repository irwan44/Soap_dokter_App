package com.example.soap_app_d_medis;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        //Initialize Bottom Navigation View.
        BottomNavigationView navView = findViewById(R.id.bottomNav_view);
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }*/

        //Pass the ID's of Different destinations
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_favourites, R.id.navigation_search)
                .build();
        //Initialize NavController.
        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public void medical (View view) {
        Intent i = new Intent(MainActivity.this, MainMedicalRecord.class);
        startActivity(i);
    }
    public void antrian (View view) {
        Intent i = new Intent(MainActivity.this, MainAntrian.class);
        startActivity(i);
    }
    public void soap (View view) {
        Intent i = new Intent(MainActivity.this, MainSOAP.class);
        startActivity(i);
    }
    public void pendapatan (View view) {
        Intent i = new Intent(MainActivity.this, MainPendapatan.class);
        startActivity(i);
    }
    public void gantipassword (View view) {
        Intent i = new Intent(MainActivity.this, MainLupaPassword.class);
        startActivity(i);
    }
    public void informasi (View view) {
        Intent i = new Intent(MainActivity.this, MainInformasion.class);
        startActivity(i);
    }
    public void edit (View view) {
        Intent i = new Intent( MainActivity.this, MainEditProfile.class);
        startActivity(i);
    }



}