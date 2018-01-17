package com.example.user.livestreaming;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Personal_info extends AppCompatActivity {

    TabLayout tabs;
    PersonalAdapter adapter;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        tabs = findViewById(R.id.tabs);
        pager = findViewById(R.id.pager);

        adapter = new PersonalAdapter(getSupportFragmentManager(), 3);

        tabs.addTab(tabs.newTab().setText("Personal"));
        tabs.addTab(tabs.newTab().setText("Education"));
        tabs.addTab(tabs.newTab().setText("Career"));


        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);

        tabs.getTabAt(0).setText("Personal");
        tabs.getTabAt(1).setText("Education");
        tabs.getTabAt(2).setText("Career");


    }


    public class PersonalAdapter extends FragmentStatePagerAdapter {


        public PersonalAdapter(FragmentManager fm, int tab) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            if (position == 0) {

                return new Personal();
            } else if (position == 1) {

                return new Education();
            } else if (position == 2) {

                return new Career();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


    public static class Personal extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.personal, container, false);
            return view;
        }


    }


    public static class Education extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.educationp , container , false);
            return view;
        }
    }


    public static class Career extends Fragment {


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.career , container , false);
            return view;
        }
    }
}
