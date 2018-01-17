package com.example.user.livestreaming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by USER on 16-01-2018.
 */

public class Career extends Fragment {

    TextView exper , name , position;

    ConnectionDetector cd;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.career , container , false);

        cd = new ConnectionDetector(getContext());

        exper = view.findViewById(R.id.experience);
        position = view.findViewById(R.id.position);
        name = view.findViewById(R.id.name);

        return view;
    }
}
