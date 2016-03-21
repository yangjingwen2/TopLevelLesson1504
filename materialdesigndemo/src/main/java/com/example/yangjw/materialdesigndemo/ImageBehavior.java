package com.example.yangjw.materialdesigndemo;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by yangjw on 2016/3/21.
 */
public class ImageBehavior extends CoordinatorLayout.Behavior<ImageView>{


    public ImageBehavior() {
    }

    public ImageBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 需要滚动的View的滚动行为，是依赖哪个控件的变化而变化的。
     * @param parent
     * @param child 需要自定义滚动效果的控件，此处是一个ImageView
     * @param dependency 被依赖的控件
     * @return
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, ImageView child, View dependency) {
        //表示ImageView接下来的移动行为，依赖于ToolBar的行为而发生变化
//        Log.d("demo","-------------------->" + (dependency instanceof Toolbar));

        return dependency instanceof Toolbar;
    }

    int i=1;

    /**
     * 只要layoutDependsOn返回true。则会触发次方法的执行
     * @param parent
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, ImageView child, View dependency) {
        float dependencyY = dependency.getY();
        Log.d("demo", "--->" + dependencyY);
        child.setY(500 + dependencyY);
        child.setX(400 + dependencyY);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) child.getLayoutParams();
        layoutParams.width = child.getWidth() - i++;
        layoutParams.height = child.getHeight() - i++;
        child.setLayoutParams(layoutParams);
        return true;
    }
}
