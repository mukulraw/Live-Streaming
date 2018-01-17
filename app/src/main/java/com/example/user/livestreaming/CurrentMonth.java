package com.example.user.livestreaming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by USER on 17-01-2018.
 */

public class CurrentMonth extends Fragment {

    RecyclerView grid;
    GridLayoutManager manager;
    MonthlyAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.currentmonth , container , false);
        grid = view.findViewById(R.id.grid);

        adapter = new MonthlyAdapter(getContext());
        manager = new GridLayoutManager(getContext() , 1);
        grid.setAdapter(adapter);
        grid.setLayoutManager(manager);



        return view;
    }

    public class MonthlyAdapter extends RecyclerView.Adapter<MonthlyAdapter.MyViewHolder> {


        Context context;

        public MonthlyAdapter(Context context){

            this.context = context;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.monthly_list_model , parent , false);
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

            ImageView arrow;

            public MyViewHolder(View itemView) {
                super(itemView);

                arrow = itemView.findViewById(R.id.arrow);

                arrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {



                    }
                });




            }
        }
    }

}
