package com.zzp.pojo;

/**
 * Created by zhengping.zhu
 * on 2017/3/22.
 */
public class Result<T> {

    //    error_code
    private Integer status;

    //    error_msg
    private String msg;

    //    content
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer code) {
        this.status = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData(Object object) {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
