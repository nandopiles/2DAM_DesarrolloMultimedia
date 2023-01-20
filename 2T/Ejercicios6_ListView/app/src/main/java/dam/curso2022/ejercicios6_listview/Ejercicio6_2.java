package dam.curso2022.ejercicios6_listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio6_2 extends AppCompatActivity {
    private ListView listado1;
    private TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_2);

        tv1 = findViewById(R.id.tv2);
        listado1 = findViewById(R.id.miLista2);
        final String[] datos = new String[]{"España", "Chipre", "Chile", "Italia", "Messi", "Alemania", "Suecia", "Suiza", "Países Bajos", "Portugal"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datos);
        listado1.setAdapter(adaptador);

        listado1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                String elemento = (String) parent.getItemAtPosition(posicion);
                tv1.setText(elemento);
                //String elemento = (String) parent.getAdapter().getItem(posicion);
            }
        });
    }
}
