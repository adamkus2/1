package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button guziczek;
    TextView napis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guziczek = findViewById(R.id.guzik_zaokraglony);
        napis=findViewById(R.id.tekscik);

        guziczek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                napis.setText("Witaj Zosia");

            }
        });



    }
}