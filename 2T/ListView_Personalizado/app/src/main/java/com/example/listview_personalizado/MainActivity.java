package com.example.listview_personalizado;

import android.annotation.SuppressLint;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<Averia> averiaList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listview);
        List<Averia> misAverias = Arrays.asList(
                new Averia("Espejo Roto", "Audi A4", "", 10),
                new Averia("Cambio de Aceite", "Audi A1", "", 20),
                new Averia("Tubo de escape Quemado", "Honda Civic", "", 100),
                new Averia("Faro Roto", "Renault Clio", "", 0));

        averiaList = new ArrayList<>(misAverias);

        MiAdaptadorAverias adaptadorAverias = new MiAdaptadorAverias(
                this,
                R.layout.averia_item,
                averiaList
        );

        lista.setAdapter(adaptadorAverias);
    }
}