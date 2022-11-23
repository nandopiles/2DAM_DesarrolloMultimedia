package dam.curso2022.animaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation miAnimacion = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animacion);
                miAnimacion.setRepeatMode(Animation.RESTART);
                miAnimacion.setRepeatCount(2);
                tv.startAnimation(miAnimacion);
            }
        });
    }


}