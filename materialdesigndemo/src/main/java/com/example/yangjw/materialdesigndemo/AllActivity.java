package com.example.yangjw.materialdesigndemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.yangjw.materialdesigndemo.fragment.Tab1Fragment;
import com.example.yangjw.materialdesigndemo.fragment.Tab2Fragment;

import java.util.ArrayList;
import java.util.List;

public class AllActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private TabLayout mTabLayout;
    private ViewPager mViewpger;

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        mToolBar = (Toolbar) findViewById(R.id.all_tool_bar);
        mTabLayout = (TabLayout) findViewById(R.id.all_tab_layout);
        mViewpger = (ViewPager) findViewById(R.id.all_view_pager);

        fragments.add(Tab1Fragment.newInstance(null,null));
        fragments.add(Tab2Fragment.newInstance(null, null));

        titles.add("首页");
        titles.add("金牌");

        //完成TabLayout+Viewpager的组合
        mViewpger.setAdapter(new MyAdapter(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mViewpger);

    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }
}
