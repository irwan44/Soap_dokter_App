package com.example.soap_app_d_medis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.soap_app_d_medis.Adapter.RequestHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MainSOAP extends AppCompatActivity {

    String val_token, soap_selesai, soap_pending, soap_total;
    TextView txt_soap_selesai, txt_soap_pending, txt_soap_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_soap);
        getSupportActionBar().hide();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
//            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

//        txt_soap_selesai = findViewById(R.id.txt_soap_selesai);
//        txt_soap_pending = findViewById(R.id.txt_soap_pending);
//        txt_soap_total = findViewById(R.id.txt_soap_total);

    }

    private void getDataSoap(){
        //first getting the values
        final String isiToken    = val_token;
        final String APIurl      = RequestHandler.APIdev;

        //if everything is fine
        class ambilData extends AsyncTask<Void, Void, String> {

            ProgressBar progressBar;

            @Override
            protected String doInBackground(Void... voids) {
                //creating request handler object
                RequestHandler requestHandler = new RequestHandler();

                //creating request parameters
                HashMap<String, String> params = new HashMap<>();

                //returing the response
                return requestHandler.requestData(APIurl+"/api/v1/cek-data-px.php", "POST", "application/json; charset=utf-8", "X-Api-Token",
                        isiToken, "X-Px-Key", "", params);
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
//                progressBar = (ProgressBar) findViewById(R.id.progressBar);
//                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
//                progressBar.setVisibility(View.GONE);

                try {//converting response to json object
                    JSONObject obj = new JSONObject(s);

                    //if no error in response
                    if (obj.getString("code").equals("500")) {
//                        ambilToken();
                    } else {
//                        GetSpnProv();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        ambilData pl = new ambilData();
        pl.execute();
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