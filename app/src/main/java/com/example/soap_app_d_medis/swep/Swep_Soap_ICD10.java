package com.example.soap_app_d_medis.swep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.soap_app_d_medis.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Swep_Soap_ICD10 extends BottomSheetDialogFragment {


    public Swep_Soap_ICD10() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.swep_soap_icd10,container,false);
        return view;



    }
    @Override public int getTheme() {
        return R.style.CustomBottomSheetDialog;
    }

}