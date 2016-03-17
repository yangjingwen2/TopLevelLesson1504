package com.example.yangjw.cardview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

public class ErweimaActivity extends AppCompatActivity {

    private ImageView scanImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_erweima);
        scanImageView = (ImageView) findViewById(R.id.scan_iv);
        //0，到 1
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f,1.0f,0f,1.0f);
        scaleAnimation.setRepeatCount(-1);//无限次数
        scaleAnimation.setRepeatMode(ScaleAnimation.RESTART);
        scaleAnimation.setInterpolator(new LinearInterpolator());
        scaleAnimation.setDuration(2000);
        scanImageView.startAnimation(scaleAnimation);

    }

}
