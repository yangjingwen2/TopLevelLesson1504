package com.example.yangjw.liwushuodemo.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yangjw on 2016/3/15.
 */
public class DateFormatTool {

    /**
     * 格式化固定的时间
     * @param time
     * @return 年月日 星期
     */
    public static String formatDate(long time) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");
//        return sdf.format(new Date(time));
        return formatDate(time,"yyyy-MM-dd E");
    }

    public static String formatDate(long time,String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(time));
    }
}
