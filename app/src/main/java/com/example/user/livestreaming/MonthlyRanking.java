package com.example.user.livestreaming;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MonthlyRanking extends AppCompatActivity {

   Toolbar toolbar;

   TextView current , last;
    ViewAdapter1 adapter1;

    ViewPager pager;

    LinearLayout linear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_ranking);
        toolbar = findViewById(R.id.toolbar);

        pager = findViewById(R.id.pager);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //toolbar.setTitleTextColor(Color.WHITE);
        //toolbar.setNavigationIcon(R.drawable.arrow);
        /*toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }


        });
*/
        adapter1 = new ViewAdapter1(getSupportFragmentManager() , 2);
        pager.setAdapter(adapter1);


        current= findViewById(R.id.currentmonth);
        last = findViewById(R.id.lastmonth);





        current.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               pager.setCurrentItem(0);


                current.setBackgroundResource(R.drawable.background_cdcdcd);
                last.setBackgroundResource(R.drawable.white);
                //hot.setTextColor(Color.BLACK);
                //follow.setTextColor(Color.WHITE);
                //linear.setVisibility(View.VISIBLE);


            }
        });


        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(1);

                last.setBackgroundResource(R.drawable.background_cdcdcd);
                current.setBackgroundResource(R.drawable.white);
                //follow.setTextColor(Color.WHITE);
                //hot.setTextColor(Color.BLACK);
                //linear.setVisibility(View.GONE);


            }
        });


    }

    public class ViewAdapter1 extends FragmentStatePagerAdapter {


        public ViewAdapter1(FragmentManager fm, int tab) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (position == 0) {
                return new CurrentMonth();
            } else {
                if (position == 1) {
                    return new LastMonth();
                }
            }


            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
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



}
