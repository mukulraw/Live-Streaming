package com.example.user.livestreaming;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AllChatsMessage extends AppCompatActivity {


    Toolbar toolbar;

    RecyclerView grid;
    GridLayoutManager manager;

    MessageAdapter adapter;

    ConnectionDetector cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_chats_message);

        cd = new ConnectionDetector(this);

        grid = findViewById(R.id.grid);
        manager = new GridLayoutManager(this , 1);
        adapter = new MessageAdapter(this);
        grid.setAdapter(adapter);
        grid.setLayoutManager(manager);

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

    @Override
    protected void onResume() {
        super.onResume();
        toolbar.setTitle("Messages");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.notification)
        {

            //Intent i = new Intent(MainActivity . this , Notification.class);
            //startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }


    public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

        Context context;

        public MessageAdapter(Context context){
            this.context = context;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.message_list_model , parent , false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 15;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            CircleImageView image;
            TextView username , just , status;

            public MyViewHolder(View itemView) {
                super(itemView);


                username = itemView.findViewById(R.id.username);
                just = itemView.findViewById(R.id.justnow);
                status = itemView.findViewById(R.id.status);
                image = itemView.findViewById(R.id.profile);


                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent i = new Intent(context , AllChats.class);
                        context.startActivity(i);

                    }
                });
            }
        }
    }



}
