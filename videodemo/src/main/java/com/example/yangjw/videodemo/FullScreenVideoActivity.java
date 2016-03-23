package com.example.yangjw.videodemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;

/**
 * 全屏的VideoView
 */
public class FullScreenVideoActivity extends AppCompatActivity {

    private CustomVideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_video);
        mVideoView = (CustomVideoView) findViewById(R.id.custom_videoview);
        //获取视屏播放地址
        Uri uri = Uri.parse(Config.URL);
        MediaController mediaController = new MediaController(this);
        mVideoView.setMediaController(mediaController);
        mVideoView.setVideoURI(uri);
        mVideoView.start();
    }
}
