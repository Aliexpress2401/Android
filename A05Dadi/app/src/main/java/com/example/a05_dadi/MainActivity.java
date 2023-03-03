package com.example.a05_dadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtMonete;
    TextView txtGiriFatti;
    TextView txtDado1;
    TextView txtDado2;
    TextView txtDado3;
    Button btnLancia;
    TextView txtRisposta;

    Random random = new Random();
    int monete = 200;
    int dado1;
    int dado2;
    int dado3;
    int giriFatti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMonete = findViewById(R.id.txtMonete);
        txtGiriFatti = findViewById(R.id.txtGiriFatti);
        txtDado1 = findViewById(R.id.txtDado1);
        txtDado2 = findViewById(R.id.txtDado2);
        txtDado3 = findViewById(R.id.txtDado3);
        btnLancia = findViewById(R.id.btnLancia);
        txtRisposta = findViewById(R.id.txtRisposta);
    }

    public void lancio(View v){
        monete--;
        txtMonete.setText("Monete: " + monete);
        giriFatti++;
        txtGiriFatti.setText("Giri: " + giriFatti);

        dado1 = 1 + random.nextInt(6);
        dado2 = 1 + random.nextInt(6);
        dado3 = 1 + random.nextInt(6);

        txtDado1.setText(Integer.toString(dado1));
        txtDado2.setText(Integer.toString(dado2));
        txtDado3.setText(Integer.toString(dado3));


        if(dado1==dado2 || dado2==dado3 || dado1==dado3){
            if(dado1 == dado2 && dado2==dado3){
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
            btnLancia.setEnabled(false);
        }
    }
}