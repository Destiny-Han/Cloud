package com.qf.provider.common.vo;

import lombok.Data;

/**
 * @author : 韩博
 * @program : Cloud
 * @description : 接口的统一返回结果
 * @create : 2020-11-24 16:43:00
 */
@Data

public class R {
    private int code;
    private String msg;
    private Object data;

    public R() {
    }

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R Ok() {
        return new R(100,"ok",null);
    }
    public static R Ok(Object data ) {
        return new R(100,"ok",data);
    }
    public static R fail() {
        return new R(101,"error",null);
    }
    public static R fail(String msg) {
        return new R(101,msg,null);
    }
    public static R Ok(String msg) {
        return new R(100,msg,null);
    }

}
