package com.example.a12_ciclovita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("A12CicloDiVita", "onCreate: Sono l'OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("A12CicloDiVita" , "sono in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A12CicloDiVita" , "sono in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A12CicloDiVita" , "sono in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A12CicloDiVita", "sono in onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A12CicloDiVita" , "sono in onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A12CicloDiVita" , "sono in onDestroy");
    }

}