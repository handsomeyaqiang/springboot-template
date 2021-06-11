package com.jikewang.send.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.Charsets;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: HttpUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:12
 * @Version: 1.0
 */
public class HttpUtil {
    public static final String URL = "http://amp-api.rrdbg.com/open/account-receive";

    public static JSONObject postHttpJson(String url, String data) throws IOException, InterruptedException {
        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(100000).setConnectTimeout(100000).build();
        post.setConfig(requestConfig);

        StringEntity s = new StringEntity(data, Charset.forName("UTF-8"));

        post.addHeader("Content-Type", "application/json;charset=utf-8");
        post.setHeader("Accept", "application/json");
        post.setEntity(s);
        CloseableHttpResponse closeableHttpResponse = httpclient.execute(post);
        System.out.println("--:" + closeableHttpResponse);
        if (closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
            String result = EntityUtils.toString(closeableHttpResponse.getEntity());
            return JSONObject.parseObject(result);
        }
        System.out.println("重发：");
        int i = 3;
        while (i > 0) {
            Thread.sleep(2000L);
            closeableHttpResponse = httpclient.execute(post);
            if (closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
                i--; continue;
            }
            String result = EntityUtils.toString(closeableHttpResponse.getEntity());
            return JSONObject.parseObject(result);
        }
        return null;
    }
}