package com.example.yangjw.xutilshhcdemo.wedgit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by yangjw on 2016/3/22.
 */
public class CustomImageView extends ImageView {
    public CustomImageView(Context context) {
        this(context,null);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                this.setPadding(10,10,10,10);
                break;
            case MotionEvent.ACTION_UP:
                this.setPadding(0,0,0,0);
                break;
        }
        return true;
    }
}
