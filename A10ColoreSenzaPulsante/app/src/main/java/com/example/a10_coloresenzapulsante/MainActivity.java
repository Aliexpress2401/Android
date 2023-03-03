package com.example.a10_coloresenzapulsante;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
        imgColore = findViewById(R.id.imgColore);

        seekBar1.setOnSeekBarChangeListener(seekListener);
        seekBar2.setOnSeekBarChangeListener(seekListener);
        seekBar3.setOnSeekBarChangeListener(seekListener);
    }



    private SeekBar.OnSeekBarChangeListener seekListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            int hue = seekBar1.getProgress();
            int saturation = seekBar2.getProgress();
            int value = seekBar3.getProgress();

            float[]array = new float[]{
                    hue, saturation, value
            };

            txtHue.setText("Hue: " + hue);
            txtSaturation.setText("Saturation: " + saturation);
            txtValue.setText("Value: " + value);

            imgColore.setBackgroundColor(Color.HSVToColor(array));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }

    };
}