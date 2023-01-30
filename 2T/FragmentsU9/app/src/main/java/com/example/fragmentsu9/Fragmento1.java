package com.example.fragmentsu9;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragmento1 extends Fragment {
    private EditText et1, et2;
    private Button btnSumar;
    private TextView tvSuma;

    public Fragmento1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        et1 = view.findViewById(R.id.et1);
        et2 = view.findViewById(R.id.et2);
        btnSumar = view.findViewById(R.id.btnSumar);
        tvSuma = view.findViewById(R.id.tvSuma);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(et1.getText().toString());
                int valor2 = Integer.parseInt(et2.getText().toString());
                int resta = valor1 - valor2;

                tvSuma.setText("La RESTA es de => " + resta);
            }
        });
    }
}