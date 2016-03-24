package com.example.yangjw.cartdemo;

import android.app.Application;

import org.xutils.x;

/**
 * Created by yangjw on 2016/3/24.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
