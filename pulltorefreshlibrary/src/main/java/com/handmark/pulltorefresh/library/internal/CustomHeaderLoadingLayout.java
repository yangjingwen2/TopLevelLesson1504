package com.handmark.pulltorefresh.library.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.R;

/**
 * Created by yangjw on 2016/3/17.
 */
public class CustomHeaderLoadingLayout extends LoadingLayout{

    AnimationDrawable animationDrawable;

    public CustomHeaderLoadingLayout(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.Orientation scrollDirection, TypedArray attrs) {
        super(context, mode, scrollDirection, attrs);
        mHeaderImage.setImageResource(R.drawable.box_anim);
        animationDrawable = (AnimationDrawable) mHeaderImage.getDrawable();
    }

    /**
     * 设置图片默认资源
     * @return
     */
    @Override
    protected int getDefaultDrawableResId() {
        return R.drawable.box_01;
    }

    @Override
    protected void onLoadingDrawableSet(Drawable imageDrawable) {

    }

    /**
     * 下拉时回调的方法
     * @param scaleOfLayout
     */
    @Override
    protected void onPullImpl(float scaleOfLayout) {

    }

    /**
     * 下拉时执行
     */
    @Override
    protected void pullToRefreshImpl() {

    }

    /**
     * 刷新过程中执行
     */
    @Override
    protected void refreshingImpl() {

        animationDrawable.start();
    }

    /**
     * 松开时执行
     */
    @Override
    protected void releaseToRefreshImpl() {


    }

    /**
     * 当一个刷新动作结束时，重置方法
     */
    @Override
    protected void resetImpl() {
        mHeaderImage.clearAnimation();
    }
}
