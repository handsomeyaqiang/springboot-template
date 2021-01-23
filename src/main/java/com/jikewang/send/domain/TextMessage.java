package com.jikewang.send.domain;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: TextMessage
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:53
 * @Version: 1.0
 */
public class TextMessage implements Message {
    private JSONObject textMsg;
    private JSONObject text;

    public TextMessage() {
        this.textMsg = new JSONObject();
        this.textMsg.put("msgtype", "text");
        this.text = new JSONObject();
        this.textMsg.put("text", this.text);
    }

    public void setContent(String content) {
        this.text.put("content", content);
    }

    public String getContent() {
        return this.text.getString("content");
    }

    public void setMentionedMobileList(List<String> mentionedMobileList) {
        this.text.put("mentioned_mobile_list", mentionedMobileList);
    }

    public String toJSONString() {
        return this.textMsg.toJSONString();
    }
    public static void main(String[] args) {
        TextMessage msg = new TextMessage();
        msg.setContent("jikewang");
        List<String> list = new ArrayList<String>();
        list.add("13520272395");
        list.add("1982309234");
        msg.setMentionedMobileList(list);
        System.out.println(msg.toJSONString());
    }
}
