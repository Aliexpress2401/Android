package com.example.a18_customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Contatti[] rubrica ={
            new Contatti(R.drawable.neve,"Martina","Smilovich","123456789"),
            new Contatti(R.drawable.neve,"Manuel","Levak","123456789"),
            new Contatti(R.drawable.neve,"Davide","De Giorgio","123456789"),
            new Contatti(R.drawable.neve,"Andrea","Divo","123456789"),
            new Contatti(R.drawable.neve,"Marco","Cantarutti","123456789"),
            new Contatti(R.drawable.neve,"Simone","Menozzi","123456789"),
            new Contatti(R.drawable.neve,"Elena","Rovelli","123456789"),
            new Contatti(R.drawable.neve,"Edoardo","De Sio","123456789"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this,R.layout.activity_main,rubrica);

        listView.setAdapter(adapter);

    }
}