package dam.curso2022.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Log.i("PRACTICA 00", "Estoy onCreate PERO 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("PRACTICA 00", "Estoy onStart PERO 2");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i ("PRACTICA 00", "Estoy onResume PERO 2");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i ("PRACTICA 00", "Estoy onPause PERO 2");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i ("PRACTICA 00", "Estoy onStop PERO 2");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i ("PRACTICA 00", "Estoy onDestroy PERO 2");

        /*Cuando se destruya la Activity se nos abrirá Google*/
        /*Intent ejemplo = new Intent(Intent.ACTION_VIEW);
        ejemplo.setData(Uri.parse("http://www.google.es"));
        startActivity(ejemplo);*/
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addCategory("android.intent.category.DEFAULT");
        startActivity(intent);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i ("PRACTICA 00", "Estoy onRestart PERO 2");
    }
}