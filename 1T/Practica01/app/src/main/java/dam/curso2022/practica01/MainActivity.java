package dam.curso2022.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("PRACTICA 00", "Estoy onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("PRACTICA 00", "Estoy onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i ("PRACTICA 00", "Estoy onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i ("PRACTICA 00", "Estoy onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i ("PRACTICA 00", "Estoy onStop");
        Intent ejemplo = new Intent(this, Activity2.class);
        startActivity(ejemplo);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i ("PRACTICA 00", "Estoy onDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i ("PRACTICA 00", "Estoy onRestart");
    }
}