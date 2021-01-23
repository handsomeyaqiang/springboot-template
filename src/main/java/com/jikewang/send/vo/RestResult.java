package com.jikewang.send.vo;

import com.jikewang.send.utils.Consts;

import java.io.Serializable;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.vo
 * @ClassName: RestResult
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:07
 * @Version: 1.0
 */
public class RestResult implements Serializable {
    public String code;
    public String msg;
    public Object data;

    public RestResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public RestResult() {}

    public static RestResult error() {
        return new RestResult(Consts.ERR_CODE, Consts.ERR_MSG, null);
    }

    public static RestResult error(String msg) {
        return new RestResult(Consts.ERR_CODE, msg, null);
    }

    public static RestResult error(String code, String msg) {
        return new RestResult(code, msg, null);
    }

    public static RestResult success() {
        return new RestResult(Consts.SUCC_CODE, Consts.SUCC_MSG, null);
    }

    public static RestResult success(Object data) {
        return new RestResult(Consts.SUCC_CODE, Consts.SUCC_MSG, data);
    }
}

