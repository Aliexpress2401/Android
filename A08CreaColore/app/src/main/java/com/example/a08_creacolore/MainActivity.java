package com.example.a08_creacolore;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtHue;
    TextView txtSaturation;
    TextView txtValue;
    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;
    Button btnGenera;
    ImageView imgColore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHue = findViewById(R.id.txtHue);
        txtSaturation = findViewById(R.id.txtSaturation);
        txtValue = findViewById(R.id.txtValue);
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3 = findViewById(R.id.seekBar3);
        btnGenera = findViewById(R.id.btnGenera);
        imgColore = findViewById(R.id.imgColore);
    }

    public void Genera (View v){

       int Bar1 = seekBar1.getProgress();
       int Bar2 = seekBar2.getProgress();
       int Bar3 = seekBar3.getProgress();


        imgColore.setBackgroundColor(Color.rgb(Bar1, Bar2, Bar3));
    }

}