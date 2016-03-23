package com.example.yangjw.videodemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * VideoView控件的使用
 */
public class VideoViewActivity extends AppCompatActivity {

    private VideoView mVedioView;

        private Button mPlayAndPauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        mVedioView = (VideoView) findViewById(R.id.video_vedioview);
        mPlayAndPauseBtn = (Button) findViewById(R.id.video_play_pause);
        //是VideoView的控制面板
        MediaController mediaController = new MediaController(this);
        //将控制面板添加到VideoView中
        mVedioView.setMediaController(mediaController);
        //设置视频的数据源链接
        Uri uri = Uri.parse(Config.URL);
        //将uri赋值给VideoView
        mVedioView.setVideoURI(uri);



        mPlayAndPauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //isPlaying是否在播放
                if (mVedioView.isPlaying()) {
                    mVedioView.pause();
                } else {
                    //播放
                    mVedioView.start();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
