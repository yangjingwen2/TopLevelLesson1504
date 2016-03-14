package com.example.yangjw.slidingpanelayoutdemo;

import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SlidingPaneLayout mSlidingLayout;
    private View mSlidingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSlidingLayout = (SlidingPaneLayout) findViewById(R.id.main_sliding_layout);
        mSlidingMenu = findViewById(R.id.main_sliding_menu);
        //设置SlidingLayout的滑动监听事件
        mSlidingLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {

            //滑动中执行此方法
            //slideOffset表示滑动的偏移量
            //panel:内容界面的视图
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                //滑动的过程中对Menu界面进行放大缩小的操作


                Log.d("demo", "-->" + panel + "--" + slideOffset);
                mSlidingMenu.setAlpha(slideOffset);
                mSlidingMenu.setScaleX(2 - slideOffset);
//                mSlidingMenu.setScaleY(2-slideOffset);
//                panel.setAlpha(slideOffset);
            }

            //完全打开
            @Override
            public void onPanelOpened(View panel) {
                Log.d("demo", "onPanelOpened-->" + panel );

            }

            //完全关闭
            @Override
            public void onPanelClosed(View panel) {
                Log.d("demo", "onPanelClosed" + panel + "--" );

            }
        });
    }
}
