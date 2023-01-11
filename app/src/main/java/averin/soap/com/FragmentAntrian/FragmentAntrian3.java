package averin.soap.com.FragmentAntrian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.soap_app_d_medis.R;

public class FragmentAntrian3 extends Fragment {

    public static FragmentAntrian3 newInstance() {
        return new FragmentAntrian3();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_anterian3, container, false);
        return view;
    }
}