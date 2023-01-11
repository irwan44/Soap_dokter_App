package averin.soap.com;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import averin.soap.com.FragmentAntrian.FragmentAntrian3;
import averin.soap.com.FragmentDetailMR.FragmentLabora;
import averin.soap.com.FragmentDetailMR.FragmentResep;

import com.example.soap_app_d_medis.R;
import com.google.android.material.tabs.TabLayout;

public class MainDetailMR extends AppCompatActivity {
    AppCompatButton btn_RiwayatPasien;
    LinearLayout personalinfo, experience, review, dropdowm, dropdowm2;
    TextView personalinfobtn, experiencebtn, reviewbtn;

    private TabAdapter adapter;
    private TabLayout tabLayout;
//    private ViewPager viewPager;

    //Dialog Confirm
    AlertDialog.Builder dial_builder;
    AlertDialog dial_riwayat;
    LayoutInflater inflater;
    View dialogView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_medical_record_pasien2);
        getSupportActionBar().hide();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

//        viewPager = (ViewPager) findViewById(R.id.viewPager);
        dropdowm = findViewById(R.id.layout);
        dropdowm.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        dropdowm2 = findViewById(R.id.layout2);
        dropdowm2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


        tabLayout = (TabLayout) findViewById(R.id.tabLayout2);
        adapter = new TabAdapter(getSupportFragmentManager());
            adapter.addFragment(new FragmentResep(), "Resep Docker");
        adapter.addFragment(new FragmentLabora(), "Lobaratorium");
        adapter.addFragment(new FragmentAntrian3(), "Radiologi");
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);




    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void expanded(View view) {
        int v = (dropdowm.getVisibility()== View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(dropdowm,new AutoTransition());
        dropdowm.setVisibility(v);
    }
    public void expanded2 (View view) {
        int v = (dropdowm2.getVisibility()== View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(dropdowm2,new AutoTransition());
        dropdowm2.setVisibility(v);
    }
    public void gosoap (View view) {
        Intent i = new Intent(MainDetailMR.this, MainSOAPMenu.class);
        startActivity(i);
    }
    public void toolbar (View view) {
        Intent i = new Intent( MainDetailMR.this, MainMedicalRecord.class);
        startActivity(i);
    }
    public void backsoap (View view) {
        Intent i = new Intent( MainDetailMR.this, MainSOAPMenu.class);
        startActivity(i);
    }
}