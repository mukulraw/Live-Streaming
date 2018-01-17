package com.example.user.livestreaming;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by USER on 16-01-2018.
 */

public class Vlo1 extends Fragment {

    RecyclerView grid , grid1;

    LinearLayoutManager manager;
    GridLayoutManager manager1;

    VAdapter adapter;
    VAdapter1  adapter1;

    Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_vlog1 , container , false);


        toolbar = (Toolbar)view.findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
       // getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitleTextColor(Color.WHITE);
        //toolbar.setNavigationIcon(R.drawable.arrow);
        /*toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  finish();
            }


        });
*/



        grid = view.findViewById(R.id.grid);
        grid1 = view.findViewById(R.id.grid1);

        manager = new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false);
        manager1 = new GridLayoutManager(getContext(), 1);

        adapter = new VAdapter(getContext());
        adapter1 = new VAdapter1(getContext());

        grid.setAdapter(adapter);
        grid1.setAdapter(adapter1);

        grid.setLayoutManager(manager);
        grid1.setLayoutManager(manager1);

        return view;
    }




    public class VAdapter extends RecyclerView.Adapter<VAdapter.MyViewHolder>{


        Context context;

        public VAdapter(Context context){

            this.context = context;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context).inflate(R.layout.vlog1_list_model , parent  , false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 15;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{
            public MyViewHolder(View itemView) {
                super(itemView);
            }
        }
    }




    public class VAdapter1 extends RecyclerView.Adapter<VAdapter1.MyViewHolder>{


        Context context;

        public VAdapter1(Context context){

            this.context = context;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context).inflate(R.layout.vlo1_list_model , parent  , false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 15;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{
            public MyViewHolder(View itemView) {
                super(itemView);
            }
        }
    }

}
