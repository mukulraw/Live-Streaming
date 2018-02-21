package com.example.user.livestreaming;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Screen1 extends Fragment {

    TabLayout tabs;
    ViewPager pager;
    ViewAdapter adapter;

    ProgressBar bar;

    TextView popular , following;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_screen1 , container , false);
        pager = view.findViewById(R.id.pager);
        tabs =view. findViewById(R.id.tabs);
        bar =view. findViewById(R.id.progress);
        popular =view. findViewById(R.id.popular);
        following =view. findViewById(R.id.following);

        adapter = new ViewAdapter(getChildFragmentManager() , 3);
        tabs.addTab(tabs.newTab().setText("LIVE"));
        tabs.addTab(tabs.newTab().setText("UPCOMING"));
        tabs.addTab(tabs.newTab().setText("VIDEO"));

        tabs.setupWithViewPager(pager);
        pager.setAdapter(adapter);


        tabs.getTabAt(0).setText("LIVE");
        tabs.getTabAt(1).setText("UPCOMING");
        tabs.getTabAt(2).setText("VIDEO");



        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pager.setCurrentItem(0);
                popular.setBackgroundResource(R.drawable.background_cdcdcd);
                following.setBackgroundResource(R.drawable.white);
                //hot.setTextColor(Color.BLACK);
                //follow.setTextColor(Color.WHITE);
                //linear.setVisibility(View.VISIBLE);


            }
        });


        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(1);

                following.setBackgroundResource(R.drawable.background_cdcdcd);
                popular.setBackgroundResource(R.drawable.white);
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

                return new LiveFragment();
            } else if (position == 1) {

                return new UpcomingFragment();
            } else if (position == 2) {

                return new VideoFragment();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    public static class LiveFragment extends Fragment {

        RecyclerView grid;
        GridLayoutManager manager;
        LiveAdapter1 adapter;

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.livefragment , container , false);

            grid = view.findViewById(R.id.grid);

            manager = new GridLayoutManager(getContext() , 1);
            adapter = new LiveAdapter1(getContext());
            grid.setAdapter(adapter);
            grid.setLayoutManager(manager);
            return view;
        }
    }

    public static class LiveAdapter1 extends RecyclerView.Adapter<LiveAdapter1.MyViewHolder> {

        Context context;

        public LiveAdapter1(Context context){

            this.context = context;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(context).inflate(R.layout.live_list_model , parent , false);

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







    public static class UpcomingFragment extends Fragment {


        RecyclerView grid;
        GridLayoutManager manager;
        UpcomingAdapter adapter;



        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.upcomingfragment , container , false);

            grid = view.findViewById(R.id.grid);

            manager = new GridLayoutManager(getContext() , 1);
            adapter = new UpcomingAdapter(getContext());
            grid.setAdapter(adapter);
            grid.setLayoutManager(manager);


            return view;
        }
    }

    public static class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.MyViewAdapter> {

        Context context;


        public UpcomingAdapter(Context context){

            this.context = context;
        }

        @Override
        public MyViewAdapter onCreateViewHolder(ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context).inflate(R.layout.upcoming_list_model , parent , false);
            return new MyViewAdapter(view);
        }

        @Override
        public void onBindViewHolder(MyViewAdapter holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 12;
        }

        public class MyViewAdapter extends RecyclerView.ViewHolder {
            public MyViewAdapter(View itemView) {
                super(itemView);
            }
        }
    }




    public static  class VideoFragment extends Fragment {


        RecyclerView grid;
        GridLayoutManager manager;
        UpcomingAdapter1 adapter;



        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.videofragment , container , false);

            grid = view.findViewById(R.id.grid);

            manager = new GridLayoutManager(getContext() , 1);
            adapter = new UpcomingAdapter1(getContext());
            grid.setAdapter(adapter);
            grid.setLayoutManager(manager);
            return view;
        }
    }



    public static class UpcomingAdapter1 extends RecyclerView.Adapter<UpcomingAdapter1.MyViewAdapter> {

        Context context;


        public UpcomingAdapter1(Context context){

            this.context = context;
        }

        @Override
        public MyViewAdapter onCreateViewHolder(ViewGroup parent, int viewType) {


            View view = LayoutInflater.from(context).inflate(R.layout.video_list_model , parent , false);
            return new MyViewAdapter(view);
        }

        @Override
        public void onBindViewHolder(MyViewAdapter holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 12;
        }

        public class MyViewAdapter extends RecyclerView.ViewHolder {
            public MyViewAdapter(View itemView) {
                super(itemView);
            }
        }
    }


}
