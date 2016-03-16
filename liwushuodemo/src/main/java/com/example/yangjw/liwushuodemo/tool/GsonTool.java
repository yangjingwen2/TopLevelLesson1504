package com.example.yangjw.liwushuodemo.tool;

import android.support.design.widget.TabLayout;

import com.google.gson.Gson;

/**
 * Created by yangjw on 2016/3/16.
 */
public class GsonTool {

    private static Gson gson = new Gson();

    /**
     * 将一个json字符串转换成Object对象
     * @param json
     * @param object
     * @param <T>
     * @return
     */
    public static <T> T parseJson2Object(String json,Class<T> object) {
        return gson.fromJson(json,object);
    }
}
