package com.example.yangjw.tablayoutdemo;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.yangjw.tablayoutdemo.fragment.BaseFragment;
import com.example.yangjw.tablayoutdemo.fragment.FoodFragment;
import com.example.yangjw.tablayoutdemo.fragment.HomeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * TabLayout控件的使用
 */
public class MainActivity extends AppCompatActivity implements BaseFragment.OnFragmentInteractionListener{

    private TabLayout mTabLayout;
    private ViewPager mContentPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private ContentPagerAdapter mContentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.main_tab_layout);
        mContentPager = (ViewPager) findViewById(R.id.main_tab_content_pager);

        //给TabLayout添加Tab按钮
//        mTabLayout.addTab(mTabLayout.newTab().setText("精选").setIcon(R.mipmap.ic_launcher));
//        mTabLayout.addTab(mTabLayout.newTab().setText("涨姿势"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("海淘"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食1"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食2"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食3"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食4"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食5"));
//        mTabLayout.addTab(mTabLayout.newTab().setText("美食6"));

        //设置TabLayout可以滚动
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        setupViewPager();
        tabPager();
    }

    /**
     * 设置ViewPager
     */
    private void setupViewPager() {
        //加入适配器
        fragmentList.add(HomeFragment.newInstance(null,null));
        fragmentList.add(FoodFragment.newInstance(null,null));

        //创建适配器对象
        mContentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        mContentPager.setAdapter(mContentPagerAdapter);


    }


    /**
     * TabLayoutd和ViewPager的结合
     */
    private void tabPager() {
        //TabLayout影响ViewPager
        mTabLayout.setupWithViewPager(mContentPager);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    /**
     * ViewPager的适配器
     */
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
            return fragmentList.size();
        }

        //当TabLayout和ViewPager结合使用时，此方法返回的是Tab的标题
        @Override
        public CharSequence getPageTitle(int position) {
            return "菜单" + position;
        }
    }
}
