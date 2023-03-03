package com.example.a11_coloreesadecimale;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtTesto;
    EditText edtColore;
    ImageView imgColore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTesto = findViewById(R.id.txtTesto);
        edtColore = findViewById(R.id.edtColore);
        imgColore = findViewById(R.id.imgColore);

        edtColore.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try{


                    txtTesto.setText(edtColore.getText());
                    int Colore = Color.parseColor(edtColore.getText().toString());

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Errore!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


}
