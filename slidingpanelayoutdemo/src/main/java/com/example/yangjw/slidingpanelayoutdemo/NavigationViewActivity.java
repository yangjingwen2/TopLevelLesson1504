package com.example.yangjw.slidingpanelayoutdemo;

import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.balysv.materialmenu.MaterialMenuDrawable;

/**
 * SldingPaneLayout+NavigationView
 */
public class NavigationViewActivity extends AppCompatActivity {

    private NavigationView mNaviView;
    private TextView mTextView;
    private SlidingPaneLayout mSlidingLayout;
    private Toolbar mToolBar;

    private boolean isOpened;
    private MaterialMenuDrawable materialMenuDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        mToolBar = (Toolbar) findViewById(R.id.maim_tool_bar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNaviView = (NavigationView) findViewById(R.id.main_navi_view);
        mTextView = (TextView) findViewById(R.id.main_sliding_content);
        mSlidingLayout = (SlidingPaneLayout) findViewById(R.id.main_navi_sliding_layout);


        View headerView = LayoutInflater.from(this).inflate(R.layout.navigation_header_view, null);
        mNaviView.addHeaderView(headerView);
//        mNaviView.getHeaderView(0)
        TextView headrText = (TextView) headerView.findViewById(R.id.navi_header_text);

        headrText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("这是头部点击事件");
                mSlidingLayout.closePane();
            }

        });

        mNaviView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                mTextView.setText(item.getTitle());
                mSlidingLayout.closePane();
                switch (item.getItemId()) {
                    case R.id.main_menu_home:
//                        mTextView.setText(item.getTitle());
                        break;
                    case R.id.main_menu_category:
//                        mTextView.setText("首页");
                        break;
                    case R.id.main_menu_settting:
                        break;
                }
                return true;
            }
        });

        //创建一个MaterialMenuDrawable
        materialMenuDrawable = new MaterialMenuDrawable(this, Color.BLACK, MaterialMenuDrawable.Stroke.THIN);
        //将ToolBar的图标替换
        mToolBar.setNavigationIcon(materialMenuDrawable);

        //设置ToolBar的按钮点击事件
        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOpened) {
                    mSlidingLayout.closePane();
                } else {
                    mSlidingLayout.openPane();
                }
            }
        });

        mSlidingLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

                //设置动画效果
                materialMenuDrawable.setTransformationOffset(
                        MaterialMenuDrawable.AnimationState.BURGER_ARROW,
                        isOpened ? 2 - slideOffset : slideOffset
                );
            }

            @Override
            public void onPanelOpened(View panel) {
                isOpened = true;
            }

            @Override
            public void onPanelClosed(View panel) {

                isOpened = false;
            }
        });

    }
}
