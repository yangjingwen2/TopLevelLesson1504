package com.handmark.pulltorefresh.library.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.R;

/**
 * Created by yangjw on 2016/3/17.
 */
public class CustomFooterLoadingLayout extends LoadingLayout{
    private  Matrix matrix;

    public CustomFooterLoadingLayout(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.Orientation scrollDirection, TypedArray attrs) {
        super(context, mode, scrollDirection, attrs);
        mHeaderImage.setScaleType(ImageView.ScaleType.MATRIX);

//        matrix = new Matrix();
//        mHeaderImage.setImageMatrix(matrix);
    }

    @Override
    protected int getDefaultDrawableResId() {
        return R.drawable.comment_empty_sofa;
    }

    @Override
    protected void onLoadingDrawableSet(Drawable imageDrawable) {

    }

    @Override
    protected void onPullImpl(float scaleOfLayout) {


        Log.d("demo","---scaleOfLayout=" + scaleOfLayout);
//        matrix.postScale(scaleOfLayout,scaleOfLayout);
//        mHeaderImage.setImageMatrix(matrix);
    }

    @Override
    protected void pullToRefreshImpl() {

    }

    @Override
    protected void refreshingImpl() {

    }

    @Override
    protected void releaseToRefreshImpl() {

    }

    @Override
    protected void resetImpl() {

    }
}
