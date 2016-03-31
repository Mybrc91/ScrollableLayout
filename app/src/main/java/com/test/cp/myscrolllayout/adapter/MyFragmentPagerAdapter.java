package com.test.cp.myscrolllayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by cpoopc on 2015-02-10.
 */
public class MyFragmentPagerAdapter<T extends Fragment> extends FragmentPagerAdapter {

    private List<T> fragmentList;
    private List<String> titleList;

    public MyFragmentPagerAdapter(FragmentManager fm, List<T> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
