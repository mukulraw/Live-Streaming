package com.example.user.livestreaming;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import de.hdodenhof.circleimageview.CircleImageView;

public class AllChats extends AppCompatActivity {

    Toolbar toolbar;

    RecyclerView grid;

    GridLayoutManager manager;

    GridAdapter adapter;

    ProgressBar bar;

    EditText type;

    Button send;

    CircleImageView profile;

    ConnectionDetector cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_chats);
        cd = new ConnectionDetector(this);

        grid = findViewById(R.id.grid);
        manager = new GridLayoutManager(this , 1);
        adapter = new GridAdapter(this);
        grid.setAdapter(adapter);
        grid.setLayoutManager(manager);

        bar = findViewById(R.id.progress);

        profile = findViewById(R.id.profile);
        send = findViewById(R.id.send);
        type = findViewById(R.id.type);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.drawable.arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();


            }


        });
    }

       

    }

