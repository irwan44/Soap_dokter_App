package averin.soap.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.soap_app_d_medis.R;

public class MainAntrian extends AppCompatActivity {
    private TabAdapter adapter;
//    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int indicatorWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_antrian);
        getSupportActionBar().hide();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }
//        viewPager = (ViewPager) findViewById(R.id.viewPager);


//        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//        adapter = new TabAdapter(getSupportFragmentManager());
//        adapter.addFragment(new FragmentAntrian1(), "Umum");
//        adapter.addFragment(new FragmentAntrian2(), "BPJS");
//        adapter.addFragment(new FragmentAntrian3(), "Asuransi");
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);




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

    public void detailklinik (View view) {
        Intent i = new Intent(MainAntrian.this, MainAntrianKlinik.class);
        startActivity(i);
    }
//    public void toolbar (View view) {
//        Intent i = new Intent(MainAntrian.this, Home.class);
//        startActivity(i);
//    }
    public void toolbar2 (View view) {
        Intent i = new Intent(MainAntrian.this, Home.class);
        startActivity(i);
    }
    public void medical2 (View view) {
        Intent i = new Intent(MainAntrian.this, MainDetailMR.class);
        startActivity(i);
    }
}