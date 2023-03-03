package com.example.luce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtV;
    View Sfondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager manager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Sensor lightSensor = manager.getDefaultSensor(Sensor.TYPE_LIGHT);
        manager.registerListener(lightListener,lightSensor,SensorManager.SENSOR_DELAY_NORMAL);

        txtV = findViewById(R.id.txtV);
        Sfondo = findViewById(R.id.Sfondo);
    }

    private SensorEventListener lightListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            float luce = sensorEvent.values[0];
            txtV.setText(String.format("%.2f",luce));
            if(luce<2){
                Sfondo.setBackgroundColor(getResources().getColor(R.color.purple_700));
                txtV.setTextColor(getResources().getColor(R.color.white));
            }
            else {
                txtV.setTextColor(getResources().getColor(R.color.black));
                Sfondo.setBackgroundColor(getResources().getColor(R.color.white));
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };

}