package dam.curso2022.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar1, seekBar2, seekBar3;
    private TextView textView1, textView2, textView3;
    private View view;
    private int valueR = 0, valueG = 0, valueB = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar1 = (SeekBar) findViewById(R.id.sb1);
        textView1 = (TextView) findViewById(R.id.tv1);
        seekBar2 = (SeekBar) findViewById(R.id.sb2);
        textView2 = (TextView) findViewById(R.id.tv2);
        seekBar3 = (SeekBar) findViewById(R.id.sb3);
        textView3 = (TextView) findViewById(R.id.tv3);
        view = (View) findViewById(R.id.fondo);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView1.setText("R: " + i);
                valueR = i;
                view.setBackgroundColor(Color.rgb(valueR, valueG, valueB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView2.setText("G: " + i);
                valueG = i;
                view.setBackgroundColor(Color.rgb(valueR, valueG, valueB));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView3.setText("B: " + i);
                valueB = i;
                view.setBackgroundColor(Color.rgb(valueR, valueG, valueB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}