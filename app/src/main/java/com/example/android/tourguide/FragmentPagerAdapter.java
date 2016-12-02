package com.example.android.tourguide;

import android.content.res.Resources;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Zark on 11/30/2016.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    /**
     * The number of fragments included in the FragmentPagerAdapter
     **/
    private final int FRAGMENT_COUNT = 4;

    /**
     * Used to pass in the application's context to the class
     */
    private Context mContext;


    /**
     * Default constructor
     */
    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    /**
     * Method to retrieve fragments
     *
     * @param position in tablayout
     * @return the current fragment
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                position = 0;
                return new MustSeeFragment();
            case 1:
                position = 1;
                return new DiningFragment();
            case 2:
                position = 2;
                return new ShoppingFragment();
            case 3:
                position = 3;
                return new HotelsFragment();
            default:
                return null;
        }
    }

    /**
     * Method to get the number of fragments included in the TabLayout
     *
     * @return number of fragments
     */
    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    /**
     * Method to set the fragment titles in the TabLayout
     *
     * @param position of each fragment
     * @return title of fragment
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.see);
            case 1:
                return mContext.getString(R.string.eat);
            case 2:
                return mContext.getString(R.string.shop);
            case 3:
                return mContext.getString(R.string.sleep);
            default:
                return null;
        }
    }
}
