package dam.curso2022.ej5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tercero extends AppCompatActivity {
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercero);
        tv3 = findViewById(R.id.tv3);
        tv3.append("Texto añadido con Append desde Java");
    }
}