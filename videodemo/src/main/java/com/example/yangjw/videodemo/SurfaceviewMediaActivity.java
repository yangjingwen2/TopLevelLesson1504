package com.example.yangjw.videodemo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * 完成Surfaceview+MediaPlayer组合实现视频播放功能
 * 1、获取一个SurfaceView对象
 * 2、给SurfaceHolder类添加CallBack方法
 * 3、创建一个MediaPlayer对象
 */
public class SurfaceviewMediaActivity extends AppCompatActivity implements SurfaceHolder.Callback,MediaPlayer.OnPreparedListener{

    private SurfaceView mSurfaceView;
    private MediaPlayer mediaPlayer;
    private Button stopAndStartBtn;
    private Button pauseAndStart;

    private boolean isPaused;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surfaceview_media);
        mSurfaceView = (SurfaceView) findViewById(R.id.surfaceview_videoview);
        stopAndStartBtn = (Button) findViewById(R.id.stop_and_start);
        pauseAndStart = (Button) findViewById(R.id.pause_and_start);
        //通过mSurfaceView获取它的绘图帮助类Holder
        SurfaceHolder holder = mSurfaceView.getHolder();
        //设置Holder的回调监听方法
        holder.addCallback(this);
        initMedia();

        setListener();
    }

    private void setListener() {

        stopAndStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer.isPlaying() || isPaused) {
                    mediaPlayer.stop();
                    isPaused = false;
                    pauseAndStart.setVisibility(View.GONE);
                } else {
                    mediaPlayer.prepareAsync();
                    isPaused = false;
                    pauseAndStart.setVisibility(View.VISIBLE);
                }
            }
        });

        pauseAndStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    isPaused = true;
                } else {
                    isPaused = false;
                    mediaPlayer.start();
                }
            }
        });

        //当播放视频时，出现异常，会毁掉此接口
//        mediaPlayer.setOnErrorListener();

        //当视频播放完成之后的监听
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                //设置下一个视频自动播放

            }
        });
    }

    private void initMedia() {
        //多媒体播放的工具类
        mediaPlayer = new MediaPlayer();
    }

    /**
     * 当Holder准备好之后会回调此方法
     * @param holder
     */
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        //Holder类和Surfaceview已经全部初始化结束，可以执行绘图的逻辑代码。
        //重置mediaPlayer对象，让其恢复到初始状态
        mediaPlayer.reset();
        //设置数据源
        //参数一：上下文，参数二：Uri对象（数据连接）
        Uri uri = Uri.parse(Config.URL);
        try {
            mediaPlayer.setDataSource(this,uri);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //将MediaPlayer采集到的视屏数据，绘制到SurfaceView中
        //此处使用Holder对象.将SurfaceView和MediaPlayer进行关联
        mediaPlayer.setDisplay(holder);
        //准备采集视屏数据(异步加载视屏数据)
        //准备工作做完之后，会将准备结束的消息通过接口(setOnPreparedListener)回掉的方式进行告知
        mediaPlayer.prepareAsync();
        //接收mediaPlayer的准备工作结束后的回调接口
        mediaPlayer.setOnPreparedListener(this);
    }

    /**
     * 当surface的大小发生改变的时候，执行此方法
     * @param holder
     * @param format
     * @param width
     * @param height
     */
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    /**
     * 试图销毁时，执行的次方法
     * @param holder
     */
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        //当试图销毁的时候，停止播放
        mediaPlayer.stop();
        //释放资源
        mediaPlayer.release();



    }

    /**
     * 准备工作结束后的，回掉方法
     * @param mp
     */
    @Override
    public void onPrepared(MediaPlayer mp) {

        //准备视频数据结束后，在此方法中进行视频播放
        mediaPlayer.start();
    }
}
