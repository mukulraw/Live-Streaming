package com.example.user.livestreaming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Goliv extends AppCompatActivity {


    Button golive;

    ImageView galat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goliv);

        golive = findViewById(R.id.golive);
        galat = findViewById(R.id.galat);

        golive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Goliv.this , ChatScree.class);
                startActivity(i);

            }
        });
        galat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}
