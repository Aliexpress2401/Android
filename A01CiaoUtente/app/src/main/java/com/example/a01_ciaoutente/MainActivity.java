package com.example.a01_ciaoutente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView    txtMessaggio;
    EditText    edtNome;
    Button      btnEsegui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessaggio    = findViewById(R.id.txtMessaggio);
        edtNome         = findViewById(R.id.edtNome);
        btnEsegui       = findViewById(R.id.btnEsegui);
    }

    public void saluta(View v){
        txtMessaggio.setText("Ciao " + edtNome.getText() + "!");
        btnEsegui.setText("Fatto");

    //Aggiunte
        Log.i("TEST", "" + txtMessaggio.getText());
        Toast t = Toast.makeText(getApplicationContext(), "Brava " + edtNome.getText() + " Messaggio Giusto!", Toast.LENGTH_SHORT);
        t.show();
    //Oppure
       // Toast.makeText(getApplicationContext(), "Messaggio", Toast.LENGTH_LONG).show();
    }

}