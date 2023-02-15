package dam.curso2022.ejercicios6_listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio6_6 extends AppCompatActivity {

    private TextView tv5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_6);

        tv5 = findViewById(R.id.tv5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ejercicio6_6, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.optLunes:
                tv5.setText("Pulsado el DÍA Lunes");
                break;
            case R.id.optMartes:
                tv5.setText("Pulsado el DÍA Martes");
                break;
            case R.id.optMiercoles:
                tv5.setText("Pulsado el DÍA Miércoles");
                break;
            case R.id.optJueves:
                tv5.setText("Pulsado el DÍA Jueves");
                break;
            case R.id.optEnero:
                tv5.setText("Pulsado el MES Enero");
                break;
            case R.id.optFebrero:
                tv5.setText("Pulsado el MES Febrero");
                break;
            case R.id.optMarzo:
                tv5.setText("Pulsado el MES Marzo");
                break;
            case R.id.optAbril:
                tv5.setText("Pulsado el MES Abril");
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
