package com.example.yangjw.jpush1504demo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by yangjw on 2016/3/25.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);
    }
}
