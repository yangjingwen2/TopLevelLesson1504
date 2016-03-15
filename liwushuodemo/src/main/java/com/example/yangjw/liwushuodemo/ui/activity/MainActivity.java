package com.example.yangjw.liwushuodemo.ui.activity;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yangjw.liwushuodemo.BaseActivity;
import com.example.yangjw.liwushuodemo.BaseFragment;
import com.example.yangjw.liwushuodemo.R;
import com.example.yangjw.liwushuodemo.ui.fragment.CategoryCommonFragment;
import com.example.yangjw.liwushuodemo.ui.fragment.HeartSelectedFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity{

    @Bind(R.id.guide_tablayout)
    TabLayout mTabLayout;
    @Bind(R.id.guide_viewPager)
    ViewPager mViewPager;

    private ContentPagerAdapter mContentPagerAdapter;
    private List<BaseFragment> fragmentList = new ArrayList<>();
    private List<String> mTitleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupViewPager();
        setupTabLayout();
    }

    /**
     * 设置TabLayou参数
     */
    private void setupTabLayout() {
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    /**
     * 设置ViewPager
     */
    private void setupViewPager() {

        mTitleList.add("精选");
        mTitleList.add("涨姿势");
        mTitleList.add("美食");
        mTitleList.add("海淘");
        mTitleList.add("礼物");
        mTitleList.add("爱运动");

        //初始化数据源
        fragmentList.add(HeartSelectedFragment.newInstance());
        fragmentList.add(CategoryCommonFragment.newInstance());
        fragmentList.add(CategoryCommonFragment.newInstance());
        fragmentList.add(CategoryCommonFragment.newInstance());
        fragmentList.add(CategoryCommonFragment.newInstance());
        fragmentList.add(CategoryCommonFragment.newInstance());
        //ViewPager关联适配器
        mContentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mContentPagerAdapter);

        //ViewPager和TabLayout关联
        mTabLayout.setupWithViewPager(mViewPager);
    }


    //ViewPager的适配器
    class ContentPagerAdapter extends FragmentPagerAdapter {

        public ContentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList == null ?0:fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleList.get(position);
        }
    }

}
