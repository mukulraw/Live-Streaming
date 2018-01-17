package com.example.user.livestreaming;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by USER on 16-01-2018.
 */

public class Followers extends Fragment {

    Toolbar toolbar;

    FollowersAdapter adapter;
    RecyclerView grid;
    GridLayoutManager manager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_following , container , false);

        grid = view. findViewById(R.id.grid);
        manager = new GridLayoutManager(getContext() , 1);
        adapter = new FollowersAdapter(getContext());
        grid.setLayoutManager(manager);
        grid.setAdapter(adapter);
        return view;
    }
    public class FollowersAdapter extends RecyclerView.Adapter<FollowersAdapter.MyViewHolder> {


        Context context;

        public FollowersAdapter(Context context){
            this.context = context;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.followers_list_model , parent , false);
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
            public MyViewHolder(View itemView) {
                super(itemView);
            }
        }
    }



}
