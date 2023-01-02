package com.example.soap_app_d_medis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.tabs.TabLayout;

public class MainAntrian extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int indicatorWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_antrian);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        viewPager = (ViewPager) findViewById(R.id.viewPager);


        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentAntrian1(), "Antrian Baru");
        adapter.addFragment(new FragmentAntrian2(), "Menunggu");
        adapter.addFragment(new FragmentAntrian3(), "Selesai");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.pilihklinik);
        textView.setAdapter(adapter);



        /*//menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar LabToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(LabToolbar);
//        LabToolbar.setLogoDescription(getResources().getString(R.string.app_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        LabToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });*/

    }
    private static final String[] COUNTRIES = new String[] {
            "Klinik Omega 3", "Klinik Omega 4", "Klinik Omega 5"
    };
    public void detailklinik (View view) {
        Intent i = new Intent(MainAntrian.this, MainAntrianKlinik.class);
        startActivity(i);
    }}