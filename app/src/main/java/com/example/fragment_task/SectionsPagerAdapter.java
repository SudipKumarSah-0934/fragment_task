package com.example.fragment_task;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragment_task.all_fragments.Services.AndroidServices;
import com.example.fragment_task.all_fragments.layout_fragments.Constraint_Layout_Fragments;
import com.example.fragment_task.all_fragments.layout_fragments.Frame_Layout_Fragments;
import com.example.fragment_task.all_fragments.layout_fragments.LinearLayoutFragment;
import com.example.fragment_task.all_fragments.layout_fragments.Relative_Layout_Fragments;
import com.example.fragment_task.all_fragments.recyclerview.Fragment_Static_Recycler;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment =  null;
        switch (position){
            case 0:
                fragment = Fragment_Static_Recycler.newInstance();
                break;
            case 1:
                fragment = AndroidServices.newInstance();
                break;
            case 2:
                fragment = LinearLayoutFragment.newInstance();
                break;
            case 3:
                fragment = Constraint_Layout_Fragments.newInstance();
                break;
            case 4:
                fragment = Frame_Layout_Fragments.newInstance();
                break;
            case 5:
                fragment = Relative_Layout_Fragments.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Fragment_Static_Recycler";
            case 1:
                return "Android Services";
            case 2:
                return "Linear Layout";
            case 3:
                return "Constraint Layout";
            case 4:
                return "Frame Layout";
            case 5:
                return "Relative Layout";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 6;
    }
}