package dam.curso2022.examen45;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private TextView miColor;
    private SeekBar sbRed, sbGreen, sbBlue;
    private Button miBoton;
    private int red = 0, green = 0, blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miColor = findViewById(R.id.miColor);
        sbRed = findViewById(R.id.sbRed);
        sbGreen = findViewById(R.id.sbGreen);
        sbBlue = findViewById(R.id.sbBlue);
        miBoton = findViewById(R.id.miBoton);

        /* No me crea correctamente el directorio fonts por lo que me pega petardazo

        Typeface mifuente = getResources().getFont(R.font.grasping);
        miColor.setTypeface(mifuente);*/

        miColor.setTextColor(Color.rgb(red, green, blue));

        sbRed.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Calculadora.class);
                startActivity(intent);
            }
        });
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        switch (seekBar.getId()) {
            case R.id.sbRed:
                red = i;
                break;
            case R.id.sbGreen:
                green = i;
                break;
            case R.id.sbBlue:
                blue = i;
                break;
        }
        miColor.setText("Rojo=\"" + red + "\"" + " Green=\"" + green + "\"" + " Blue=\"" + blue + "\"");
        miColor.setTextColor(Color.rgb(red, green, blue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}