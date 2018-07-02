package com.example.android.tourguideapp;

import android.app.ActionBar;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:Starting.");

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        //Setup the View1Pager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AttractionsFragment(), getString(R.string.section_attractions));
        adapter.addFragment(new RestaurantsFragment(), getString(R.string.section_restaurants));
        adapter.addFragment(new BeachesFragment(), getString(R.string.section_beaches));
        adapter.addFragment(new ShoppingFragment(), getString(R.string.section_shopping));
        adapter.addFragment(new SportsFragment(), getString(R.string.section_sports));
        viewPager.setAdapter(adapter);
    }
}