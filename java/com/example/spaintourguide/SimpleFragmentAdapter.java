package com.example.spaintourguide;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {
    final int pageCount = 4;
    Context mContext;
    //used for defining the tab title text views


    public SimpleFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BarcelonaDestinationsFragment();
        } else if (position == 1) {
            return new MadridDestinationsFragment();
        } else if (position == 2) {
            return new TarragonaDestinationsFragment();
        } else {
            return new IbizaDestinationsFragment();
        }
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String[] tabTitles = new String[]{mContext.getResources().getString(R.string.barcelona_tab), mContext.getResources().getString(R.string.madrid_tab),
                mContext.getResources().getString(R.string.tarragona_tab), mContext.getResources().getString(R.string.ibiza_tab)};
        // Generate title based on item position
        return tabTitles[position];
    }

}
