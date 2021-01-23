package com.jikewang.send.domain;

import com.alibaba.fastjson.JSONObject;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: NewsArticle
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:50
 * @Version: 1.0
 */
public class NewsArticle {
    private JSONObject article = new JSONObject();


    public void setTitle(String title) { this.article.put("title", title); }


    public void setDescription(String description) { this.article.put("description", description); }


    public void setUrl(String url) { this.article.put("url", url); }


    public void setPicurl(String picurl) { this.article.put("picurl", picurl); }



    public JSONObject getArticle() { return this.article; }
}

