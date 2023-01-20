package com.example.listview_personalizado;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptadorAverias extends ArrayAdapter<Averia> {
    Context ctx;
    int layoutTempleate;
    List<Averia> averiaList;

    public MiAdaptadorAverias(@NonNull Context context, int resource, @NonNull List<Averia> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layoutTempleate = resource;
        this.averiaList = objects;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        @SuppressLint("ViewHolder")
        View v = LayoutInflater.from(ctx).inflate(layoutTempleate, parent, false);

        // Obtener la info el elemento de la lista que estoy iterando en este momento
        Averia elementoActual = averiaList.get(position);

        // Rescatar los elementos de la IU de la template
        TextView titulo = v.findViewById(R.id.textViewTitulo);
        TextView modelo = v.findViewById(R.id.textViewModeloCoche);
        TextView presupuesto = v.findViewById(R.id.textViewPresupuesto);

        // Hacer un set de la info del elemento actual en los elementos de la IU
        titulo.setText(elementoActual.getTitulo());
        modelo.setText(elementoActual.getModeloCoche());
        presupuesto.setText(elementoActual.getNumeroPresupuesto() + " presupuestos");

        return v;
    }
}
