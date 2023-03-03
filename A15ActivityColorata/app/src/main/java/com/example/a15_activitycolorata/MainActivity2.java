package com.example.a15_activitycolorata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity2 extends AppCompatActivity {

    int Colore;
    SeekBar seek;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        seek = findViewById(R.id.seek);
        img = findViewById(R.id.img);

        seek.setOnSeekBarChangeListener(change);
    }
    private SeekBar.OnSeekBarChangeListener change = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            Colore = seek.getProgress();
            float [] value = new float[]{Colore, 1, 100};
            img.setBackgroundColor(Colore);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    public void finish (){
        Intent i = new Intent();
        i.putExtra("Colore", Colore);
        setResult(RESULT_OK, i);
        super.finish();
    }
}