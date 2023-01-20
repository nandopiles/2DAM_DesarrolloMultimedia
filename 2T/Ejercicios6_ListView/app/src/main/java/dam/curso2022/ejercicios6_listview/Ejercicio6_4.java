package dam.curso2022.ejercicios6_listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio6_4
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    private Spinner listado3;
    private TextView tv3;
    private final String[] datos = new String[]{"España", "Chipre", "Chile", "Italia", "Messi", "Alemania", "Suecia", "Suiza", "Países Bajos", "Portugal"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_4);

        tv3 = findViewById(R.id.tv3);
        listado3 = findViewById(R.id.miLista3);
        listado3.setOnItemSelectedListener(this);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        adaptador.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        listado3.setAdapter(adaptador);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int posicion, long id) {
        String elemento = (String) parent.getItemAtPosition(posicion);
        tv3.setText(elemento);
        //String elemento = (String) parent.getAdapter().getItem(posicion);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
