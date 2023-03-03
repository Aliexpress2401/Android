package com.example.a15_activitycolorata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnActivity;
    View Sfondo;
    int INTENT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity = findViewById(R.id.btnActivity);
        btnActivity.setOnClickListener(this);

        Log.i("A15ActivityColorata", "onCreate: Sono l'OnCreate");
    }

    public void onClick(View v){
        Intent i = new Intent(this, MainActivity2.class);

        startActivityForResult(i, INTENT_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == INTENT_CODE && requestCode == RESULT_OK){
            int Colore = data.getExtras().getInt("Colore");
            Sfondo.setBackgroundColor(Colore);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("A15ActivityColorata" , "sono in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A15ActivityColorata" , "sono in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A15ActivityColorata" , "sono in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A15ActivityColorata", "sono in onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A15ActivityColorata" , "sono in onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A15ActivityColorata" , "sono in onDestroy");
    }
}