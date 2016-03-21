package com.example.yangjw.materialdesigndemo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * 介绍一个可以伸缩ToolBar的使用
 */
public class CollapsingToolBarActivity extends AppCompatActivity {

    private Toolbar mToolBar;
    private CollapsingToolbarLayout mToolBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_tool_bar);
        mToolBar = (Toolbar) findViewById(R.id.coll_tool_bar);
        mToolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.coll_toorbar_layout);

        setSupportActionBar(mToolBar);

//        mToolBar.setTitleTextColor(Color.WHITE);

        mToolBarLayout.setCollapsedTitleTextColor(Color.WHITE);
        mToolBarLayout.setExpandedTitleColor(Color.YELLOW);
    }
}
