package com.jikewang.send.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: Consts
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:09
 * @Version: 1.0
 */
@Component
public class Consts
{
    public static final String ERR_CODE = "-1";
    public static final String ERR_MSG = "数据错误！";
    public static final String SUCC_CODE = "1000";
    public static final String SUCC_MSG = "访问成功！";
    public static final int MAX_ARTICLE_CNT = 5;
    public static final String CPT = "cpt";
    public static final String DW = "dw";
    public static String RRD_SEND_URL;
    public static final String BASE_ACCESS_PATH = "http://10.255.33.5/images/send/";
    public static String BASE_PATH;

    @Value("${base.imagePath}")
    public void setBasePath(String baseImagePath) {
        BASE_PATH = baseImagePath + "send/";
        CPT_PATH = BASE_PATH + "cpt/";
        DW_PATH = BASE_PATH + "dw/";
        IMG_PATH = BASE_PATH + "img/";
        TMP_PATH = BASE_PATH + "tmp/";
    }

    @Value("${rrd.sendUrl}")
    public void setSendUrl(String sendUrl) { RRD_SEND_URL = sendUrl; }

    public static String TMP_PATH = "";

    public static final String TMP_ACCESS_PATH = "http://10.255.33.5/images/send/tmp/";

    public static String CPT_PATH = "";

    public static String DW_PATH = "";

    public static String IMG_PATH = "";

    public static void main(String[] args) {
        HashMap<String, Object> datainfo = new HashMap();
        datainfo.put("time", new Date());
        datainfo.put("name", "jikewang");
        datainfo.put("age", 23);
        String jsonString = JSON.toJSONStringWithDateFormat(datainfo, "yyyy:MM:dd HH:mm:SS", new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat});
        System.out.println(jsonString);
    }
}
