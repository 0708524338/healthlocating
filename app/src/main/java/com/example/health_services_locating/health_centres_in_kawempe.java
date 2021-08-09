package com.example.health_services_locating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class health_centres_in_kawempe extends AppCompatActivity {
    Button total, tata, shooter, small, dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_centres_in_kawempe);
        total = findViewById(R.id.total);
        tata = findViewById(R.id.tata);
        shooter = findViewById(R.id.shooter);
        small = findViewById(R.id.small);
        dog = findViewById(R.id.dog);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(i);
            }
        });
        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(i);

            }
        });
        shooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(i);

            }
        });
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(i);

            }
        });
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(i);

            }
        });

    }}