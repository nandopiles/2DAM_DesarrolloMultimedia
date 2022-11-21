package dam.curso2022.practica01v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Contador extends AppCompatActivity implements View.OnClickListener {

    private TextView cuenta;
    private Button mas, menos, reset;
    private CheckBox min, max;
    private final static int ValorMax = 50, ValorMin = 0;
    private int valCuenta = 0;
    private final static String CUENTA = "cuenta actual";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contador_lay);

        cuenta = findViewById(R.id.tvCuenta);
        //Conectamos con el layout y el listener los botones
        mas = findViewById(R.id.btnMas);
        mas.setOnClickListener(this);
        menos = findViewById(R.id.btnMenos);
        menos.setOnClickListener(this);
        reset = findViewById(R.id.btnReset);
        reset.setOnClickListener(this);
        //Conectamos con el layout y el listener los checkbox
        min = findViewById(R.id.cbValMin);
        min.setOnClickListener(this);
        max = findViewById(R.id.cbValMax);
        max.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnMas:
                if (max.isChecked() && valCuenta < ValorMax) {
                    valCuenta++;
                    cuenta.setText(String.valueOf(valCuenta));
                } else if (!max.isChecked()) {
                    valCuenta++;
                    cuenta.setText(String.valueOf(valCuenta));
                }
                break;
            case R.id.btnMenos:
                if (min.isChecked() && valCuenta > ValorMin) {
                    valCuenta--;
                    cuenta.setText(String.valueOf(valCuenta));
                } else if (!min.isChecked())
                    valCuenta--;
                cuenta.setText(String.valueOf(valCuenta));
                break;
            case R.id.btnReset:
                valCuenta = 0;
                cuenta.setText(String.valueOf(valCuenta));
                if (max.isChecked())
                    max.toggle();
                if (min.isChecked())
                    min.toggle();
                break;
            case R.id.cbValMin:
                if (min.isChecked() && valCuenta < ValorMin) {
                    valCuenta = 0;
                    cuenta.setText(String.valueOf(valCuenta));
                }
                break;
            case R.id.cbValMax:
                if (max.isChecked() && valCuenta > ValorMax) {
                    valCuenta = 0;
                    cuenta.setText(String.valueOf(valCuenta));
                }
                break;
            default:
                break;
        }
    }

    //Sobreescribimos los métodos para guardar y recuperar el estado de la instancia
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt(CUENTA, valCuenta);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            valCuenta = savedInstanceState.getInt(CUENTA, 0);
        } else {
            valCuenta = 0;
        }
        cuenta.setText(String.valueOf(valCuenta));
    }
}