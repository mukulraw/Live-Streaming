package com.example.user.livestreaming;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by USER on 12-01-2018.
 */

public class Chat_Screen2 extends Fragment {


    CircleImageView circle;

    TextView number1 , number2 , number3 , number4 , add , coins , heartcount , viewercount;

    Button retur;

    ConnectionDetector cd;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.chatscreen2 , container , false);

        cd = new ConnectionDetector(getContext());

        circle = view.findViewById(R.id.profile);
        number1 = view.findViewById(R.id.number);
        number2 = view.findViewById(R.id.number1);
        number3 = view.findViewById(R.id.number2);
        number4 = view.findViewById(R.id.number3);
        circle = view.findViewById(R.id.profile);
        add = view.findViewById(R.id.add);
        coins = view.findViewById(R.id.coins);
        heartcount = view.findViewById(R.id.heartcount);
        viewercount = view.findViewById(R.id.viewercount);
        retur = view.findViewById(R.id.retur);

        retur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Intent i = new Intent(getContext() , .class);
                //startActivity(i);
            }
        });


        return view;
    }
}
