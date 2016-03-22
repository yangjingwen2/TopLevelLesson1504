package com.example.yangjw.xutilshhcdemo.tool;

import com.google.gson.Gson;

/**
 * Created by yangjw on 2016/3/22.
 */
public class GsonTool {

    public static <T> T json2Object(String json,Class<T> clazz) {
        //GSON
        Gson gson = new Gson();
        return gson.fromJson(json,clazz);

    }
}
