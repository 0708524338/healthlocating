package com.example.health_services_locating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ratingbar extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);
        ratingBar = findViewById(R.id.rating1);
        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float rattingvlue = ratingBar.getRating();
                Toast.makeText(ratingbar.this, "Rating: " + rattingvlue, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), com.example.health_services_locating.signin.class);
                startActivity(intent);
            }

        });

    }
}