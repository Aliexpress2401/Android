package com.example.a04_indovina100;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edtNumero;
    Button btnTenta;
    TextView txtGrandezza;
    Random random = new Random();
    int num = random.nextInt(101);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = findViewById(R.id.edtNumero);
        btnTenta = findViewById(R.id.btnTenta);
        txtGrandezza = findViewById(R.id.txtGrandezza);

    }

    public void genera(View v){
        int numInserito = Integer.parseInt(edtNumero.getText().toString());

        if(numInserito>num){
            txtGrandezza.setText("Hai inserito un numero più grande");
        }else if(numInserito<num){
            txtGrandezza.setText("Hai inserito un numero più piccolo");
        }else{
            txtGrandezza.setText("Bravo! Hai indovinato!");
        }
    }
}