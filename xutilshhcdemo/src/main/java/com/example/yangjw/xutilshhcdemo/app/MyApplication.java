package com.example.yangjw.xutilshhcdemo.app;

import android.app.Application;

import org.xutils.x;

/**
 * Created by yangjw on 2016/3/22.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Xutil的初始化
        x.Ext.init(this);
    }
}
