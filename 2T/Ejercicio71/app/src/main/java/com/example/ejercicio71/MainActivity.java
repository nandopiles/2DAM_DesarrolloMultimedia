package com.example.ejercicio71;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPreferencias;
    private Button btnRecover;
    private boolean unicoSistema;
    private String choosenSO;
    private String versionSO;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPreferencias = findViewById(R.id.btn1);
        btnRecover = findViewById(R.id.btn2);

        btnPreferencias.setOnClickListener(this);
        btnRecover.setOnClickListener(this);

        PreferenceManager.setDefaultValues(this, R.xml.main_preferences, false);
        loadPreferences();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        loadPreferences();
    }

    private void loadPreferences() {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        unicoSistema = pref.getBoolean("check_box_preference_1", false);
        choosenSO = pref.getString("list_preference_1", "WINDOWS");
        versionSO = pref.getString("edit_text_preference_1", "15");
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                String msg = "Único S.O.: " + unicoSistema +
                        "\nS.O. escogido: " + choosenSO +
                        "\nVersion S.O.: " + versionSO;
                Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
                Log.i("[INFO]", msg);
                break;
        }
    }
}