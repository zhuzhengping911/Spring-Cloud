package com.zzp.util;

import com.zzp.pojo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhengping.zhu
 * on 2017/3/22.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        if(e instanceof DescribeException){
            DescribeException pingjiaException = (DescribeException) e;
            return ResultUtil.error(pingjiaException.getCode(),pingjiaException.getMessage());
        }

        LOGGER.error("【系统异常】{}",e);
        return ResultUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }
}
