package com.geeks.home_work_2_3_ai;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    private int counter = 0;
    private Button btnMinus;
    private Button btnPlus;
    TextView txv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();


        btnPlus.setOnClickListener(v -> {
            counter++;
            txv.setText(counter + " ");
        });

        btnMinus.setOnClickListener(v -> {
            counter--;
            txv.setText(counter + " ");
        });

    }

    private void initView() {
        btnPlus = requireActivity().findViewById(R.id.btn_plus);
        btnMinus = requireActivity().findViewById(R.id.btn_minus);
        txv = requireActivity().findViewById(R.id.text_view);
    }
}