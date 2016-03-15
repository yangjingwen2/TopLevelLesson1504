package com.example.yangjw.liwushuodemo.tool;

import android.util.Log;

/**
 * 日志工具
 * Created by yangjw on 2016/3/15.
 */
public class LogTool {


    private static boolean DEBUG = true;

    public static void LOG_D(Class clazz,String log) {
        if (DEBUG) {
            Log.d(clazz.toString(),log);
        }
    }
}
