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

/**
 * Created by USER on 17-01-2018.
 */

public class Hotfiest extends Fragment {


    RecyclerView grid;
    GridLayoutManager manager;
    LiveAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hotfirst , container , false);


        grid = view.findViewById(R.id.grid);
        manager = new GridLayoutManager(getContext() , 2);

        adapter = new LiveAdapter(getContext());

        grid.setLayoutManager(manager);
        grid.setAdapter(adapter);

        return view;
    }


    public class LiveAdapter extends RecyclerView.Adapter<LiveAdapter.MyViewHolder> {


        Context context;

        public LiveAdapter(Context context){

            this.context = context;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context).inflate(R.layout.grid_list_model , parent , false);
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
