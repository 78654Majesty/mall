package com.springcloud.dream.mall.util;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.format.FastDateFormat;

import java.util.Date;

/**
 * @author fanglingxiao
 * @date 2019/1/28
 */
public class FormatTimeZoneDate {

    /**
     * 将jdk默认时间格式EEE MMM dd HH:mm:ss zzz yyyy
     * 转化为：yyyy-MM-dd HH:mm:ss
     * @param date date
     * @return Date
     */
    public static Date formatTime(Date date){
        FastDateFormat timeFormat = DatePattern.NORM_DATETIME_FORMAT;
        String format = timeFormat.format(date);
        return DateUtil.parse(format);
    }

}
