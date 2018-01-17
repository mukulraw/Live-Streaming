package com.example.user.livestreaming;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class TopRankers extends AppCompatActivity {

    Toolbar toolbar;

    TabLayout tabs;
    ViewAdapter adapter;

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_rankers);

       tabs = findViewById(R.id.tabs);
       pager = findViewById(R.id.pager);

       adapter = new ViewAdapter(getSupportFragmentManager() , 4);

        tabs.addTab(tabs.newTab().setText("Hourly"));
        tabs.addTab(tabs.newTab().setText("Daily"));
        tabs.addTab(tabs.newTab().setText("Weekly"));
        tabs.addTab(tabs.newTab().setText("Monthly"));

        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);

        tabs.getTabAt(0).setText("Hourly");
        tabs.getTabAt(1).setText("Daily");
        tabs.getTabAt(2).setText("Weekly");
        tabs.getTabAt(3).setText("Monthly");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.drawable.arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }


        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.notification)
        {

           //Intent i = new Intent(MainActivity . this , Notification.class);
            //startActivity(i);

        }


        return super.onOptionsItemSelected(item);
    }


    public class ViewAdapter extends FragmentStatePagerAdapter {


        public ViewAdapter(FragmentManager fm , int tab) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            if (position == 0){

                return new Hourly();
            }

            else if (position == 1){

                return new Daily();
            }

            else if (position == 2){

                return new Weekly();
            }

            else if (position ==3){

                return new Monthly();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }




}
