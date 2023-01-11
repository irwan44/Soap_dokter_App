package averin.soap.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.soap_app_d_medis.R;

public class MainAntrianKlinik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_antrian_klinik);
        getSupportActionBar().hide();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }
    }
    public void toolbar3 (View view) {
        Intent i = new Intent( MainAntrianKlinik.this, MainAntrian.class);
        startActivity(i);
    }
}