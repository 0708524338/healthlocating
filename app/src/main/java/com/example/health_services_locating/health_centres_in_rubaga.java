package com.example.health_services_locating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class health_centres_in_rubaga extends AppCompatActivity {
    Button gag, Boss, Lady, cow, goat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_centres_in_rubaga);
        gag=findViewById(R.id.gag);
        Boss=findViewById(R.id.Boss);
        Lady=findViewById(R.id.Lady);
        cow=findViewById(R.id.cow);
        goat=findViewById(R.id.goat);
        gag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        Boss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        Lady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
    }
}