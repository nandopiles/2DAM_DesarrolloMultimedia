package dam.curso2022.ej54;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView tv1;
    private boolean press = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.btn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if (press) {
                    tv1.setText(R.string.btnPulsado);
                    tv1.setTextColor(R.color.purple_700);
                    press = false;
                } else {
                    tv1.setText(R.string.bot_n_sin_pulsar);
                    tv1.setTextColor(R.color.teal_200);
                    press = true;
                }
            }
        });
    }
}