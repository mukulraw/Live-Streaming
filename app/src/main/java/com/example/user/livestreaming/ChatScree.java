package com.example.user.livestreaming;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatScree extends AppCompatActivity {

    RecyclerView grid , grid1;
    LinearLayoutManager manager ;
    GridLayoutManager manager1;
    ChatAdapter adapter;
    ChatScreeAdapter adapter1;

    ImageView close;

    TextView tara , beans , name , id;

    ConnectionDetector cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_scree);

        cd = new ConnectionDetector(this);

        grid = findViewById(R.id.grid);
        close = findViewById(R.id.close);
        grid1 = findViewById(R.id.grid1);

        name = findViewById(R.id.name);

        tara = findViewById(R.id.tara);

        id = findViewById(R.id.id);
        beans = findViewById(R.id.bean);
        grid1 = findViewById(R.id.grid1);
        manager = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false);
        manager1 = new GridLayoutManager(this , 1 );
        adapter = new ChatAdapter(this);
        adapter1 = new ChatScreeAdapter(this);
        grid.setLayoutManager(manager);
        grid1.setLayoutManager(manager1);
        grid.setAdapter(adapter);
        grid1.setAdapter(adapter1);



        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }


    public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

        Context context;

        public ChatAdapter(Context context){

            this.context = context;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.chat_list_model , parent , false);
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

            CircleImageView profile;

            public MyViewHolder(View itemView) {
                super(itemView);

                profile = itemView.findViewById(R.id.profile);
            }
        }
    }


    public class ChatScreeAdapter extends RecyclerView.Adapter<ChatScreeAdapter.MyViewHolder> {

        Context context;

        public ChatScreeAdapter(Context context){

            this.context = context;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.chatscree_list_model , parent , false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {


            Button num;

            TextView name ;
            public MyViewHolder(View itemView) {
                super(itemView);

                num = itemView.findViewById(R.id.number);
                name = itemView.findViewById(R.id.name);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {



                    }
                });
            }
        }
    }



}
