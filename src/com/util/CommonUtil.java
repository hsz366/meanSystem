package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

    /**
     * 获取时间的工具
     * @param time
     * @return
     */
    public static String getTime(Date time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(time);
    }
}
