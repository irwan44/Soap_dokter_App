package averin.soap.com.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.com.R;

import java.util.ArrayList;

import averin.soap.com.MainAntrian;
import averin.soap.com.MainSOAPMenu;
import averin.soap.com.Model.AntrianPoli;

public class AntrianPoliAdapter extends RecyclerView.Adapter<AntrianPoliAdapter.AntrianPoliViewHolder> {
    private ArrayList<AntrianPoli> list;

    public AntrianPoliAdapter(MainAntrian antrianActivity, ArrayList<AntrianPoli> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public AntrianPoliViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemrow_antrian_pasien, parent, false);
        return new AntrianPoliAdapter.AntrianPoliViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AntrianPoliViewHolder holder, int position) {
//        holder.idReg.setText(list.get(position).getIdReg_antrian());

    }


    public class AntrianPoliViewHolder extends RecyclerView.ViewHolder {
        private TextView tglAntri, nmKlinik, nmBagian, idReg, no_antri, nm_dokter, jamAwal, jamAkhir, status;
//        private ImageView img_fotoPasien;

        public AntrianPoliViewHolder(View itemView) {
            super(itemView);
//            no_antri = itemView.findViewById(R.id.no_antrian);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(itemView.getContext(), MainSOAPMenu.class);
//                    Declarate String
                    String regId        = idReg.getText().toString();
                    String no_antrian   = no_antri.getText().toString();
                    String nmDokter     = nm_dokter.getText().toString();
                    String tgl_dtl      = tglAntri.getText().toString();
                    String jawal_dtl    = jamAwal.getText().toString();
                    String jakhir_dtl   = jamAkhir.getText().toString();
                    String status_dtl   = status.getText().toString();
                    String nmKlinik_dtl = nmKlinik.getText().toString();
                    String nmbagian_dtl = nmBagian.getText().toString();
//                    Put to parsing
                    i.putExtra("regId", regId);
                    i.putExtra("noAntrian", no_antrian);
                    i.putExtra("nma_dokter", nmDokter);
                    i.putExtra("tgl_antri", tgl_dtl);
                    i.putExtra("jam_awal", jawal_dtl);
                    i.putExtra("jam_akhir", jakhir_dtl);
                    i.putExtra("status_antri", status_dtl);
                    i.putExtra("nm_klinik", nmKlinik_dtl);
                    i.putExtra("nm_bag", nmbagian_dtl);
                    itemView.getContext().startActivity(i);
                }
            });
        }
    }
}


