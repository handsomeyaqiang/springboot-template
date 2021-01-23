package com.jikewang.send.domain;

import com.alibaba.fastjson.JSONObject;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: MarkdownMessage
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:50
 * @Version: 1.0
 */
public class MarkdownMessage implements Message {
    private JSONObject markdownMsg;
    private JSONObject markdown;

    public MarkdownMessage() {
        this.markdownMsg = new JSONObject();
        this.markdownMsg.put("msgtype", "markdown");
        this.markdown = new JSONObject();
        this.markdownMsg.put("markdown", this.markdown);
    }

    public void setContent(String content) {
        this.markdown.put("content", content);
    }



    public String getContent() {
        return this.markdown.getString("content");
    }


    public String toJSONString() {
        return this.markdownMsg.toJSONString();
    }
}
