package com.jikewang.send.utils;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: StrUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:27
 * @Version: 1.0
 */
public class StrUtil
{
    private static String regex = "yyyy-MM-dd( HH(:mm(:ss)?)?)?";
    private static Pattern pattern = Pattern.compile(regex);

    public static String replace(String orig, Date date) {
        if (StringUtils.isEmpty(orig)) {
            return null;
        }
        Matcher matcher = pattern.matcher(orig);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
            String format = (new SimpleDateFormat(group)).format(date);
            matcher.appendReplacement(sb, format);
            System.out.println(sb.toString());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        String replace = replace("逾期效率追踪-个贷<datadt:(yyyy-MM-dd HH:mm)>123123 t:(yyyy-MM-dd sdfsdf", new Date());
        System.out.println(replace);
    }
}
