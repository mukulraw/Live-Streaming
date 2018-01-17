package com.example.user.livestreaming;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by USER on 15-01-2018.
 */

public class LiveScreen extends Fragment {


    TextView hot, follow;

    ViewPager pager;
    ViewAdapter adapter;

    LinearLayout linear;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.livescreen, container, false);


        hot = view.findViewById(R.id.hot);
        pager = view.findViewById(R.id.pager);
        follow = view.findViewById(R.id.follow);
        linear = view.findViewById(R.id.linear);

        adapter = new ViewAdapter(getChildFragmentManager() , 2);
        pager.setAdapter(adapter);

        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pager.setCurrentItem(0);


                hot.setBackgroundResource(R.drawable.background_cdcdcd);
                follow.setBackgroundResource(R.drawable.white);
                //hot.setTextColor(Color.BLACK);
                //follow.setTextColor(Color.WHITE);
                //linear.setVisibility(View.VISIBLE);


            }
        });


        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(1);

                follow.setBackgroundResource(R.drawable.background_cdcdcd);
                hot.setBackgroundResource(R.drawable.white);
                //follow.setTextColor(Color.WHITE);
                //hot.setTextColor(Color.BLACK);
                //linear.setVisibility(View.GONE);


            }
        });


        return view;


    }

    public class ViewAdapter extends FragmentStatePagerAdapter {


        public ViewAdapter(FragmentManager fm, int tab) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0) {
                return new Hotfiest();
            } else {
                if (position == 1) {
                    return new SecondHot();
                }
            }


            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


}


