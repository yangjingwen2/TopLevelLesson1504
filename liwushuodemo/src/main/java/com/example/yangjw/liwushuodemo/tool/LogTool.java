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
//            Log.d(clazz.toString(),log);
            int len = log.length();
            int num = len/1000;

            String str = "";
            for (int i=0; i<num+1; i++) {
                if (i == num) {
                    str = log.substring(i*1000,len);
                } else {
                    str = log.substring(i * 1000, 1000 * (i + 1));
                }

                Log.d(clazz.toString(),str);
            }
        }
    }
}
