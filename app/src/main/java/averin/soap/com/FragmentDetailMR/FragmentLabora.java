package averin.soap.com.FragmentDetailMR;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.soap_app_d_medis.R;

public class FragmentLabora extends Fragment {

    public static FragmentLabora newInstance() {
        return new FragmentLabora();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history_labora, container, false);
        return view;



    }
}