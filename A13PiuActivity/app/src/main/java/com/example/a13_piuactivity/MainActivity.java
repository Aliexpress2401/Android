package com.example.a13_piuactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnSito;
    Button btnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSito = findViewById(R.id.btnSito);
        btnActivity = findViewById(R.id.btnActivity);

        btnSito.setOnClickListener(this);
        btnActivity.setOnClickListener(this);

        Log.i("A13PiuActivity", "onCreate: Sono l'OnCreate");
    }

    public void onClick(View v){
        Intent i;
        switch(v.getId()){
            case R.id.btnSito:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1VUXnLcRPL98tqN9hQ-Cu7Ndj5fmT9N0q"));
                startActivity(i);
                break;
            case R.id.btnActivity:
                i = new Intent(this, MainActivity2.class);
                startActivity(i);
                break;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("A13PiuActivity" , "sono in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A13PiuActivity" , "sono in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A13PiuActivity" , "sono in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A13PiuActivity", "sono in onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A13PiuActivity" , "sono in onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A13PiuActivity" , "sono in onDestroy");
    }

}