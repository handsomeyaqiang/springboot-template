package com.jikewang.send.utils;

import com.jikewang.send.domain.Message;
import com.jikewang.send.domain.NewsArticle;
import com.jikewang.send.domain.NewsMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpStatus;

import java.io.IOException;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: MsgUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:28
 * @Version: 1.0
 */
public class MsgUtil
{
    private static String WEBHOOK = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=d21fc580-6923-4d4c-8fd8-971a75acdff4";

    public static int send(Message message) throws IOException {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(WEBHOOK);
        httppost.addHeader("Content-Type", "application/json; charset=utf-8");
        httppost.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");
        StringEntity se = new StringEntity(message.toJSONString(), "utf-8");
        httppost.setEntity(se);

        HttpResponse response = closeableHttpClient.execute(httppost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.OK.value()) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        NewsMessage message = new NewsMessage();
        NewsArticle article1 = new NewsArticle();
        article1.setTitle("水母");
        article1.setDescription("desc 1");
        article1.setPicurl("http://10.255.33.5:8578/images/send/send/dw/1.jpg");
        article1.setUrl("https://www.baidu.com");
        message.add(article1.getArticle());

        NewsArticle article2 = new NewsArticle();
        article2.setTitle("beautiful girl");
        article2.setDescription("desc 2");
        article2.setPicurl("http://10.255.33.5:8578/images/send/send/dw/2.jpg");
        article2.setUrl("https://www.baidu.com");
        message.add(article2.getArticle());

        NewsArticle article3 = new NewsArticle();
        article3.setTitle("beautiful girl2");
        article3.setDescription("desc 3");
        article3.setPicurl("http://10.255.33.5:8578/images/send/send/dw/3.jpg");
        article3.setUrl("https://www.baidu.com");
        message.add(article3.getArticle());

        NewsArticle article4 = new NewsArticle();
        article4.setTitle("beautiful girl2");
        article4.setDescription("desc 4");
        article4.setPicurl("http://10.255.33.5:8578/images/send/send/dw/4.jpg");
        article4.setUrl("https://www.baidu.com");
        message.add(article4.getArticle());
        send(message);
    }
}
