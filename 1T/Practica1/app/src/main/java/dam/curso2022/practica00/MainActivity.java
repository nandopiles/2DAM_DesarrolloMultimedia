package dam.curso2022.practica00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView msg;
    private EditText usu;
    private Button next, exit;

    public void continuamos(View view) {
       String saludo = "Bienvenido a nuestra APP\n";
       msg.setText(saludo + usu.getText().toString());
       //fin del listener
    }

    public void finalizar(View view) {
          finish();
         //finalizamos la ejecucion de la Activity
         //fin del listener
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.tvInfo) ;
        usu = findViewById(R.id.etInfo);
        next = findViewById( R.id.btnAccion) ;
        exit = findViewById(R.id.btnFin) ;
    }

    public void salir(View boton) {
        finish();
    }
}