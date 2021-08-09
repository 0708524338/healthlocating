package com.example.health_services_locating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class health_services extends AppCompatActivity {
    Button select1, select2, select5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_services);
        select1=findViewById(R.id.select1);
        select2=findViewById(R.id.select2);
        select5=findViewById(R.id.select5);
        select1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), health_centres_in_kawempe.class);
                startActivity(intent);

            }
        });
        select2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), health_centres_in_nakawa.class);
                startActivity(intent);

            }
        });

        select5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), health_centres_in_rubaga.class);
                startActivity(intent);

            }
        });    }
}