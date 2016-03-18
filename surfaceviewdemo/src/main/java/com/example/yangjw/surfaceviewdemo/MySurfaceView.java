package com.example.yangjw.surfaceviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by yangjw on 2016/3/18.
 * 使用SurfaceView的步骤
 * 1、创建一个类继承SurfaceView
 * 2、实现一个接口SurfaceHolder.CallBack接口
 * 3、重写其中的方法
 * 4、获取Holder对象（就是一个绘图后台助手）
 * 5、将第2步中的这个灰调接口配置到holder对象中，用于接收Holder对象提交的画面
 *
 * 6、开始绘图(开启一个线程)
 * 6.1、首先锁定画布，并且返回画布对象lockCanvas
 * 6.2、创建画笔，在canvas绘制内容
 * 6.3、将绘制完成的图像提交到SurfaceView的主线程中显示 unLockCanvasAndPost
 *
 * 7、在surfaceDestroyed方法中将线程停止。
 */
public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback{

    /**
     * 绘图助手，可以执行在非主线程中。
     */
    private SurfaceHolder holder;
    /**
     * 控制循环开始和结束
     */
    private boolean isStart;

    public MySurfaceView(Context context) {
        this(context, null);
    }

    public MySurfaceView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        holder = getHolder();
        //设置Holder的回掉接口，用于将工作线程中会治好的画面发回主线程，然后显示到屏幕上。
        //参数：SurfaceHolder.Callback对象
        holder.addCallback(this);
    }

    /**
     * SurfaceHolder.Callback
     * 创建绘图表面
     * @param holder
     */
    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        isStart = true;
        new CanvasThread(holder).start();
    }

    /**
     * SurfaceHolder.Callback
     * 当SurfaceView的窗口大小发生变化时，回调此方法（比如横竖屏切换）
     * @param holder
     * @param format
     * @param width
     * @param height
     */
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    /**
     * SurfaceHolder.Callback
     * 当SurfaceView销毁的时候，回调自方法（比如退出当前界面）
     * @param holder
     */
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

        isStart = false;

    }

    /**
     * 创建一个线程，完成绘图
     */
    class CanvasThread extends Thread {

        //画笔
        private Paint mPaint;
        private SurfaceHolder surfaceHolder;

        private int i;

        public CanvasThread(SurfaceHolder surfaceHolder) {
            this.mPaint = new Paint();
            this.surfaceHolder = surfaceHolder;

            mPaint.setColor(Color.GREEN);
        }

        @Override
        public void run() {
            //1、lockCanvas锁定Canvas画布,并可以获得被锁定的画布对象
            while (isStart) {
                Canvas canvas = surfaceHolder.lockCanvas();
                mPaint.setStyle(Paint.Style.STROKE);
                //2、绘制图像
                canvas.drawCircle(400, 400, 100 * (i % 2 + 1), mPaint);
                //3、将绘制好的图像画布解锁，并提交到UI线程中显示
                surfaceHolder.unlockCanvasAndPost(canvas);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }

        }
    }
}
