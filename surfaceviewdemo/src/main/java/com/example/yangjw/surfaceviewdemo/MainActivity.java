package com.example.yangjw.surfaceviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

/**
 * 使用SurfaceView的步骤
 * 1、创建一个类继承SurfaceView
 * 2、实现一个接口SurfaceHolder.CallBack接口
 * 3、重写其中的方法
 * 4、获取Holder对象（就是一个绘图后台助手）
 * 5、将第2步中的这个灰调接口配置到holder对象中，用于接收Holder对象提交的画面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
