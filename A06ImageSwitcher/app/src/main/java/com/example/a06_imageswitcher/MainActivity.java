package com.example.a06_imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgV1;
    Button btnAvanti;
    Button btnIndietro;

    int[] immagini = {R.drawable.img1,R.drawable.img2, R.drawable.img3, R.drawable.img4};
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV1 = findViewById(R.id.imgV1);
        btnAvanti = findViewById(R.id.btnAvanti);
        btnIndietro = findViewById(R.id.btnIndietro);
    }

    public void Avanti(View v){
        i++;
        if(i == immagini.length){
            i=0;
        }
        imgV1.setImageResource(immagini[i]);
    }

    public void Indietro(View v){
        i--;
        if(i < 0){
            i=immagini.length-1;
        }
        imgV1.setImageResource(immagini[i]);
    }
}