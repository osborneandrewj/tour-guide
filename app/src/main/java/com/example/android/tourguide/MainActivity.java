package com.example.android.tourguide;

/**
 * Created by Andrew Osborne for a Udacity course
 * <p>
 * Icons made by Roundicons from www.flaticon.com
 * <p>
 * Louvre Museum image courtesy of Benh LIEU SONG - Own work, CC BY-SA 3.0,
 * https://commons.wikimedia.org/w/index.php?curid=10213567
 * <p>
 * Shangri-La Hotel image By Siren-Com (Own work) [CC BY-SA 3.0
 * (http://creativecommons.org/licenses/by-sa/3.0) or GFDL (http://www.gnu.org/copyleft/fdl.html)],
 * via Wikimedia Commons
 */

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the action bar and set a custom background and center the text
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.title_bar);
        // Remove the default margins for the action bar
        Toolbar parent = (Toolbar) getSupportActionBar().getCustomView().getParent();
        parent.setContentInsetsAbsolute(0, 0);

        // Get the ViewPager and set it's PagerAdapter so that it can display the tabs
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()));

        // Give the Sliding Tabs to the viewpager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
