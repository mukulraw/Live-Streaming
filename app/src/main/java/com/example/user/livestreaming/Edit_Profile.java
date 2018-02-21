package com.example.user.livestreaming;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by USER on 23-01-2018.
 */

public class Edit_Profile extends Fragment {

    RecyclerView grid;
    GridLayoutManager manager;

    EditAdapter adapter;

    LinearLayout more , following;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.edit_profile , container , false);

        grid = view.findViewById(R.id.grid);
        more = view.findViewById(R.id.more);
        following = view.findViewById(R.id.following);

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext() , More.class);
                startActivity(i);


            }
        });

        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext() , Following.class);
                startActivity(i);


            }
        });




        return view;

    }

    public class EditAdapter extends RecyclerView.Adapter<EditAdapter.MyViewHolder> {

        Context context;


        public EditAdapter(Context context){

            this.context = context;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context).inflate(R.layout.eit_list_model , parent , false);
            return new MyViewHolder(view) ;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 15;
        }

        public class MyViewHolder  extends RecyclerView.ViewHolder{
            public MyViewHolder(View itemView) {
                super(itemView);
            }
        }
    }

}
