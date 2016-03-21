package com.example.yangjw.materialdesigndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * 完成自定义的Behavior效果
 */
public class BehaviorActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);
        mToolBar = (Toolbar) findViewById(R.id.behavior_toolbar);
        setSupportActionBar(mToolBar);
    }
}
