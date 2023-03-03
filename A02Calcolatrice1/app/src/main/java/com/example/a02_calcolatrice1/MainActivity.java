package com.example.a02_calcolatrice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView    txtRisultato;
    EditText    edtNumero1;
    EditText    edtNumero2;
    Button      btnCalcola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRisultato = findViewById(R.id.txtRisultato);
        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        btnCalcola = findViewById(R.id.btnSomma);
    }
/*
    public void addizione(View a){
        String output = "";

        try{
            int somma = Integer.parseInt(edtNumero1.getText().toString()) + Integer.parseInt(edtNumero2.getText().toString());
            txtRisultato.setText("Il risultato è: " + somma);
            output = "Giusto";
        }catch(Exception e){
            output = "Errore";
        }finally{
            Toast t = Toast.makeText(getApplicationContext(), output, Toast.LENGTH_LONG);
            t.show();
        }
    }

    public void sottrazione(View a){
        String output = "";

        try{
            int sottrazione = Integer.parseInt(edtNumero1.getText().toString()) - Integer.parseInt(edtNumero2.getText().toString());
            txtRisultato.setText("Il risultato è: " + sottrazione);
            output = "Giusto";
        }catch(Exception e){
            output = "Errore";
        }finally{
            Toast t = Toast.makeText(getApplicationContext(), output, Toast.LENGTH_LONG);
            t.show();
        }
    }

 */

    public void calcola(View view) {
        int n1, n2, ris;

        try {
            n1 = Integer.parseInt(edtNumero1.getText().toString());
            n2 = Integer.parseInt(edtNumero2.getText().toString());

            if (view.getId() == R.id.btnSomma) {
                ris = n1 + n2;
                txtRisultato.setText("Il risultato è: " + ris);
            } else {
                ris = n1 - n2;
                txtRisultato.setText("Il risultato è: " + ris);
            }
        } catch (Exception e) {
            txtRisultato.setText("Inserire dei valori!");
        }
    }

}