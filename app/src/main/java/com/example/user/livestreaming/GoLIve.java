package com.example.user.livestreaming;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by USER on 12-01-2018.
 */

public class GoLIve extends Fragment{

    Button golive;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.golive , container , false);

        golive = view.findViewById(R.id.golive);

        golive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });
        return view;
    }
}
