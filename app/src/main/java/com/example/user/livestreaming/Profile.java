package com.example.user.livestreaming;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by USER on 15-01-2018.
 */

public class Profile extends Fragment {


    TextView profileinfo , message , vlog , following , ranking;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.profile , container , false);


        profileinfo = view.findViewById(R.id.profileinfo);
        message = view.findViewById(R.id.message);
        vlog = view.findViewById(R.id.vlog);
        following = view.findViewById(R.id.following);
        ranking = view.findViewById(R.id.ranking);



        ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext() , MonthlyRanking.class);

                startActivity(i);


            }
        });


        profileinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext() , Personal_info.class);

                startActivity(i);


            }
        });


        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext() , AllChatsMessage.class);
                startActivity(i);


            }
        });

        vlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



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
}
