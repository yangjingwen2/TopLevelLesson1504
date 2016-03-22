package com.example.yangjw.mybutterknife.annotation;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yangjw on 2016/3/22.
 */
public class X {

    public static class view {
        /**
         * 完成依赖注入
         * @param activity
         */
        public static void bind(final Activity activity) {

            try {
                Class<? extends Activity> aClass = activity.getClass();
                //获得所有的属性
                Field[] fields = aClass.getFields();
                for (int i = 0; i < fields.length; i++) {
                    ViewInject annotation = fields[i].getAnnotation(ViewInject.class);
                    if (annotation != null) {
                        int resId = annotation.value();
                        View view = activity.findViewById(resId);
                        fields[i].set(activity,view);
                    }
                }

                Method[] methods = aClass.getMethods();
                for (int i = 0; i < methods.length; i++) {
                   final  Method method = methods[i];
                    Event annotation = method.getAnnotation(Event.class);
                    if (annotation != null) {
                        int resid = annotation.value();
                        //
                        activity.findViewById(resid).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    method.invoke(activity);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                } catch (InvocationTargetException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
