package com.example.a03_accesso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtUtente;
    EditText edtPassword;
    TextView txtAccesso;
    Button btnEntra;

    String email = "alice.crudele@gmail.com";
    String password = "alice2401";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUtente = findViewById(R.id.edtUtente);
        edtPassword = findViewById(R.id.edtPassword);
        txtAccesso = findViewById(R.id.txtAccesso);
        btnEntra = findViewById(R.id.btnEntra);
    }

    public void entra(View v){
        String emailIns = edtUtente.getText().toString();
        String passwordIns = edtPassword.getText().toString();

        if(email.equals(emailIns)){
            if(password.equals(passwordIns)){
                txtAccesso.setTextColor(getResources().getColor(R.color.green));
                txtAccesso.setText("Benvenuto");
            }else{
                txtAccesso.setTextColor(getResources().getColor(R.color.red));
                txtAccesso.setText("La password inserita non è giusta");
            }

        }else{
            txtAccesso.setTextColor(getResources().getColor(R.color.red));
            txtAccesso.setText("L'email inserita non è giusta");
        }
    }
}