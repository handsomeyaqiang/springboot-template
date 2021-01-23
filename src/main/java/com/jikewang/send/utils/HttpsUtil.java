package com.jikewang.send.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: HttpsUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:14
 * @Version: 1.0
 */
public class HttpsUtil
{
    private static final Logger log = LoggerFactory.getLogger(HttpsUtil.class);

    public static JSONObject post(String url, String content, String charset) throws NoSuchAlgorithmException, KeyManagementException, IOException, InterruptedException {
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, new TrustManager[] { new TrustAnyTrustManager() }, new SecureRandom());

        URL console = new URL(url);
        HttpsURLConnection conn = (HttpsURLConnection)console.openConnection();
        conn.setSSLSocketFactory(sc.getSocketFactory());
        conn.setHostnameVerifier(new TrustAnyHostnameVerifier());
        conn.setDoOutput(true);
        conn.setConnectTimeout(1000000);
        conn.setReadTimeout(100000);
        conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
        conn.setRequestProperty("Accept", "application/json");
        conn.connect();
        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
        out.write(content.getBytes(charset));

        out.flush();
        out.close();
        InputStream is = conn.getInputStream();
        if (is != null) {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }
            is.close();
            if (conn.getResponseCode() == 200)
            {
                return JSONObject.parseObject(outStream.toString());
            }
            log.error("发送失败：responseCode" + conn.getResponseCode() + ",response:" + outStream.toString());
        } else {

            log.error("发送失败：responseCode" + conn.getResponseCode() + ",conn:" + conn);
        }
        return null;
    }
}