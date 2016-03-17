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
import com.example.yangjw.liwushuodemo.bean.TabInfo;
import com.example.yangjw.liwushuodemo.http.IOkCallBack;
import com.example.yangjw.liwushuodemo.http.OkHttpTool;
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
    private List<TabInfo.DataEntity.ChannelsEntity> channels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        setupViewPager();
        setupTabLayout();
    }

    /**
     * 设置TabLayou参数
     */
    private void setupTabLayout() {
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        OkHttpTool.newInstance(this).okGet("http://api.liwushuo.com/v2/channels/preset?gender=1&generation=2", TabInfo.class, new IOkCallBack<TabInfo>() {

            @Override
            public void onSucess(TabInfo resultInfo) {
                channels = resultInfo.getData().getChannels();
                //初始化数据源
                fragmentList.add(HeartSelectedFragment.newInstance());

                for (int i = 0, size = channels.size() - 1; i < size; i++) {
                    fragmentList.add(CategoryCommonFragment.newInstance());
                }
                setupViewPager();
            }
        }, 2);
    }

    /**
     * 设置ViewPager
     */
    private void setupViewPager() {




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
            return channels.get(position).getName();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        OkHttpTool.newInstance(this).cancel(this);
    }
}
