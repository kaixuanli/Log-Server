package com.lkx.common;

/**
 * Created by Administrator on 2018/9/6.
 */
public class BaseResult<T> {

    private int code;   // 业务状态码 200， 10201 业务错误码
    private String desc;    // 描述
    private T data;       // 携带数据

    public BaseResult() {
        this.code = ResultEnum.OK.getCode();
        this.desc = ResultEnum.OK.getDesc();
    }

    public BaseResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.desc = resultEnum.getDesc();
    }

    public BaseResult(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public BaseResult setCode(int code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public BaseResult setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public T getData() {
        return data;
    }

    public BaseResult setData(T data) {
        this.data = data;
        return this;
    }
}
