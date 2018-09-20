package com.lkx.common;

/**
 * Created by Administrator on 2018/9/6.
 */
public enum ResultEnum {
    OK(200, "OK"),

    INNER_ERROR(500, "服务器内部错误"),

    SHOP_NOT_EXISTS(10020, "商品不存在"),

    PARAM_ERROR(407, "参数缺失或者参数非法");

    private int code;
    private String desc;

    ResultEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
