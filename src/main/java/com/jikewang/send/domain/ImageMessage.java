package com.jikewang.send.domain;

import com.alibaba.fastjson.JSONObject;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.domain
 * @ClassName: ImageMessage
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/14 18:45
 * @Version: 1.0
 */
public class ImageMessage  implements Message {
    private JSONObject imageMsg;
    private JSONObject image;

    public ImageMessage() {
        this.imageMsg = new JSONObject();
        this.imageMsg.put("msgtype", "image");
        this.image = new JSONObject();
        this.imageMsg.put("image", this.image);
    }
    public void setBase64(String base64) {
        this.image.put("base64", base64);
    }

    public void setMd5(String md5) {
        this.image.put("md5", md5);
    }

    public String toJSONString() {
        return this.imageMsg.toJSONString();
    }
}

