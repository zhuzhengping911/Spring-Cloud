package com.zzp.util;

/**
 * Created by zhengping.zhu
 * on 2017/3/22.
 */
public class DescribeException extends RuntimeException{

    private Integer code;

    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }
    public DescribeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
