package averin.soap.com.FragmentDetailMR;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.soap_app_d_medis.R;

public class FragmentResep extends Fragment {

    public static FragmentResep newInstance() {
        return new FragmentResep();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history_resep_dokter, container, false);
        return view;



    }
}