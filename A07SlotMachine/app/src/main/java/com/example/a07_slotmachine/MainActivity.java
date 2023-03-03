package com.example.a07_slotmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtMonete;
    TextView txtGiriFatti;
    TextView txtRisposta;
    ImageView imgVdestra;
    ImageView imgVcentro;
    ImageView imgVsinistra;
    Button btnTenta;

    Random random = new Random();
    int monete = 200;
    int giriFatti;

    int[] immagini = {R.drawable.slot1,R.drawable.slot2, R.drawable.slot3, R.drawable.slot4, R.drawable.slot5, R.drawable.slot6, R.drawable.slot7, R.drawable.slot8, R.drawable.slot9};
    int i = 0;
    int m = 0;
    int g = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMonete = findViewById(R.id.txtMonete);
        txtGiriFatti = findViewById(R.id.txtGiriFatti);
        txtRisposta = findViewById(R.id.txtRisposta);

        imgVdestra = findViewById(R.id.imgVdestra);
        imgVcentro = findViewById(R.id.imgVcentro);
        imgVsinistra = findViewById(R.id.imgVsinistra);

        btnTenta = findViewById(R.id.btnTenta);
    }

    public void Tenta (View v){
        monete--;
        txtMonete.setText("Monete: " + monete);

        giriFatti++;
        txtGiriFatti.setText("Giri: " + giriFatti);

        i = random.nextInt(9);
        m = random.nextInt(9);
        g = random.nextInt(9);

        imgVsinistra.setImageResource(immagini[i]);
        imgVcentro.setImageResource(immagini[m]);
        imgVdestra.setImageResource(immagini[g]);

        if(i==m || m==g || i==g){
            if(i == m && m==g){
                monete+=50;
                txtMonete.setText("Monete: " + monete);
                txtRisposta.setText("Hai fatto tris");
            }else{
                monete+=10;
                txtMonete.setText("Monete: " + monete);
                txtRisposta.setText("Hai fatto coppia");
            }
        }else{
            txtRisposta.setText("Ritenta sarai più fortunato!");
        }

        if(monete == 0){
            btnTenta.setEnabled(false);
        }
    }
}