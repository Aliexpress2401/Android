package com.example.a09_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    //implements View.OnClickListener Metodo D
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnUno;
    Button btnDue;
    TextView txtMesaggio;

    //Metodo C
    /*private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btnUno){
                txtMesaggio.setText("Hai cliccato uno");
            }
            else
                txtMesaggio.setText("Hai cliccato due");
        }
    };*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = findViewById(R.id.btnUno);
        btnDue = findViewById(R.id.btnDue);
        txtMesaggio = findViewById(R.id.txtMessaggio);

        //Metodo C
        // btnUno.setOnClickListener(listener);
        //btnDue.setOnClickListener(listener);

        //Metodo A
        /*btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMesaggio.setText("Hai cliccato su uno!");
            }
        });

        btnDue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMesaggio.setText("Hai cliccato su due!");
            }
        });*/

        //Metodo D
    @Override
        public void onClick(View v){
            switch(v.getId()){
            case R.id.btnUno:
                break;
            case R.id.btnDue:
                break;
            }
        }
    }

}