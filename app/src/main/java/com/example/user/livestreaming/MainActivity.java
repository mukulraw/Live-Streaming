package com.example.user.livestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.FileProvider;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import java.io.File;


public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;

    DrawerLayout drawer;

    RelativeLayout popup ;
    LinearLayout video , camera;

    private static final int VIDEO_CAPTURE = 101;
    private Uri fileUri;


    AHBottomNavigation bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom = findViewById(R.id.bottom_navigation);
        popup = findViewById(R.id.popup);
        video = findViewById(R.id.video);
        camera = findViewById(R.id.camera);


        drawer = (DrawerLayout) findViewById(R.id.activity_main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.Navigation_drawer_open, R.string.Navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();



        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this , Goliv.class);
                startActivity(i);


            }
        });


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                File mediaFile =
                        new File(Environment.getExternalStorageDirectory().getAbsolutePath()
                                + "/myvideo.mp4");

                Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);

                Uri photoURI = FileProvider.getUriForFile(MainActivity.this,
                        BuildConfig.APPLICATION_ID + ".provider",
                        mediaFile);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                startActivityForResult(intent, VIDEO_CAPTURE);


            }
        });





        AHBottomNavigationItem item1 =
                new AHBottomNavigationItem("Live", R.drawable.home);

        AHBottomNavigationItem item2 =
                new AHBottomNavigationItem("Followers", R.drawable.heart);

        AHBottomNavigationItem item3 =
                new AHBottomNavigationItem("Go Live", R.drawable.gola);

        AHBottomNavigationItem item4 =
                new AHBottomNavigationItem("Timeline", R.drawable.play);

        AHBottomNavigationItem item5 =
                new AHBottomNavigationItem("Profile", R.drawable.user);


        bottom.addItem(item1);
        bottom.addItem(item2);
        bottom.addItem(item3);
        bottom.addItem(item4);
        bottom.addItem(item5);

        bottom.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);

        bottom.setDefaultBackgroundColor(Color.parseColor("#ccffffff"));
        bottom.setAccentColor(Color.parseColor("#E91E63"));
        bottom.setInactiveColor(Color.parseColor("#333333"));


        bottom.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {

                switch (position) {
                    case 0:

                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        LiveScreen frag1 = new LiveScreen();
                        ft.replace(R.id.replace, frag1);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft.commit();

                        return true;
                    case 1:



                        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        Followers frag3 = new Followers();
                        ft2.replace(R.id.replace, frag3);
                        ft2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft2.commit();

                        return true;
                    case 2:

                        if (popup.getVisibility() == View.VISIBLE){

                            popup.setVisibility(View.GONE);
                        }

                        else {
                            popup.setVisibility(View.VISIBLE);
                        }

                     /*  Intent i = new Intent(MainActivity.this , Goliv.class);
                       startActivity(i);
*/
                        return true;
                    case 3:



                        FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        Vlo1 frag4 = new Vlo1();
                        ft3.replace(R.id.replace, frag4);
                        ft3.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft3.commit();

                        return true;
                    case 4:


                        FragmentTransaction ft5 = getSupportFragmentManager().beginTransaction();

                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }

                        Profile frag5 = new Profile();
                        ft5.replace(R.id.replace, frag5);
                        ft5.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                        ft5.commit();

                        return true;
                }

                return false;
            }
        });

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStackImmediate();
        }

        LiveScreen frag1 = new LiveScreen();
        ft.replace(R.id.replace, frag1);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft.commit();

    }




    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == VIDEO_CAPTURE) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, "Video saved to:\n" +
                        data.getData(), Toast.LENGTH_LONG).show();
            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Video recording cancelled.",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Failed to record video",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

}
