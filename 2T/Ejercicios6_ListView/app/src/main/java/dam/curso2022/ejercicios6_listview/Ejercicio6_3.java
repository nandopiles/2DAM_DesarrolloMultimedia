package dam.curso2022.ejercicios6_listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio6_3 extends AppCompatActivity {
    private GridView listado2;
    private TextView tv2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_3);

        tv2 = findViewById(R.id.tv2);
        listado2 = findViewById(R.id.miLista2);
        final String[] datos = new String[]{"España", "Chipre", "Chile", "Italia", "Messi", "Alemania", "Suecia", "Suiza", "Países Bajos", "Portugal"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datos);
        listado2.setAdapter(adaptador);

        listado2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                String elemento = (String) parent.getItemAtPosition(posicion);
                tv2.setText(elemento);
                //String elemento = (String) parent.getAdapter().getItem(posicion);
            }
        });
    }
}
