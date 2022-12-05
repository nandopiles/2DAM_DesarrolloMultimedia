package dam.curso2022.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rbL, rbM, rbMi, rbJ, rbV, rbS, rbD;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbL = findViewById(R.id.rb1);
        rbL.setOnClickListener(this);
        rbM = findViewById(R.id.rb7);
        rbM.setOnClickListener(this);
        rbMi = findViewById(R.id.rb8);
        rbMi.setOnClickListener(this);
        rbJ = findViewById(R.id.rb9);
        rbJ.setOnClickListener(this);
        rbV = findViewById(R.id.rb10);
        rbV.setOnClickListener(this);
        rbS = findViewById(R.id.rb11);
        rbS.setOnClickListener(this);
        rbD = findViewById(R.id.rb12);
        rbD.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public  void onClick(View view) {
        RadioButton rbCheck;

        rbL.setChecked(false);
        rbM.setChecked(false);
        rbMi.setChecked(false);
        rbJ.setChecked(false);
        rbV.setChecked(false);
        rbS.setChecked(false);
        rbD.setChecked(false);

        rbCheck = (RadioButton) view;
        rbCheck.setChecked(true);
        tv.setText("MARCADO " + rbCheck.getText());
    }
}