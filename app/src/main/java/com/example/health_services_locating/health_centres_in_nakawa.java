package com.example.health_services_locating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class health_centres_in_nakawa extends AppCompatActivity {
    Button Add, edii, weed, weaker, wheels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_centres_in_nakawa);
        Add=findViewById(R.id.Add);
        edii=findViewById(R.id.edii);
        weed=findViewById(R.id.weed);
        weaker=findViewById(R.id.weaker);
        wheels=findViewById(R.id.wheels);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        edii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        weed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        weaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
        wheels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), types_of_services.class);
                startActivity(intent);
            }
        });
    }
}