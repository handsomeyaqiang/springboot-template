package com.jikewang.send.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: TimeUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:26
 * @Version: 1.0
 */
public class TimeUtil {
    public static final String DEFAULT_PATTERN = "yyyyMMddHHmmss";
    public static String format(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        DateFormat dateFormat = new SimpleDateFormat((pattern == null) ? "yyyyMMddHHmmss" : pattern);
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        String s = LocalDate.now().toString();
        System.out.println(s);
    }
}