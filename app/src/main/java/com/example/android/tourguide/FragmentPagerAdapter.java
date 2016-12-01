package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Zark on 11/30/2016.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    /** The number of fragments included in the FragmentPagerAdapter **/
    private final int FRAGMENT_COUNT = 4;

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: position = 0;
                return new MustSeeFragment();
            case 1: position = 1;
                return new DiningFragment();
            case 2: position = 2;
                return new ShoppingFragment();
            case 3: position = 3;
                return new HotelsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: position = 0;
                return "Must See";
            case 1: position = 1;
                return "Dining";
            case 2: position = 2;
                return "Shopping";
            case 3: position = 3;
                return "Hotels";
            default:
                return null;
        }
    }
}
