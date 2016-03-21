package com.example.yangjw.materialdesigndemo;

import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class AppBarActivity extends AppCompatActivity {

    private Toolbar mTooBar;
    private AppBarLayout mAppBarLayout;
    private ImageView mAnchorImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar);
        //表示使用TooBar作为ActionBar使用
        mTooBar = (Toolbar) findViewById(R.id.app_tool_bar);
        setSupportActionBar(mTooBar);

        mAnchorImageView = (ImageView) findViewById(R.id.app_image_anchor);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.app_app_bar_layout);
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            /**
             * 垂直滚动的偏移量
             * @param appBarLayout
             * @param verticalOffset 偏移量。
             */
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {


                Log.d("demo", "--->verticalOffset=" + verticalOffset);
                mAnchorImageView.setY(600 + verticalOffset);
//                mAnchorImageView.setX(600 + verticalOffset);

            }
        });
    }
}
