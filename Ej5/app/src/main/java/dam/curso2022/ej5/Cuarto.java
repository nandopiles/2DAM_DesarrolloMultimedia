package dam.curso2022.ej5;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Cuarto extends AppCompatActivity {
    private TextView tv;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuarto);
        tv = findViewById(R.id.tv4);
        tv.setText(R.string.cuartoTexto);
        Typeface mifuente = getResources().getFont(R.font.stocky);
        tv.setTypeface(mifuente);
    }
}
