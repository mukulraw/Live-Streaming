package com.example.user.livestreaming;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.PublicKey;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by USER on 16-01-2018.
 */

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
