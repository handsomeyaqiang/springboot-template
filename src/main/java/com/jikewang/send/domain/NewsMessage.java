package com.jikewang.send.domain;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: NewsMessage
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:51
 * @Version: 1.0
 */
public class NewsMessage implements Message
{
    private JSONObject newsMsg;
    private JSONObject news;
    private JSONArray articles;

    public NewsMessage() {
        this.newsMsg = new JSONObject();
        this.newsMsg.put("msgtype", "news");
        this.news = new JSONObject();
        this.newsMsg.put("news", this.news);

        this.articles = new JSONArray();
        this.news.put("articles", this.articles);
    }


    public int add(JSONObject article) {
        if (article == null) {
            return -1;
        }
        if (this.articles.size() >= 5) {
            return -1;
        }
        this.articles.add(article);
        return 1;
    }

    public String toJSONString() {
        return this.newsMsg.toJSONString();
    }
}