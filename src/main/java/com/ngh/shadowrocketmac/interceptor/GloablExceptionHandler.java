package com.ngh.shadowrocketmac.interceptor;

import com.ngh.shadowrocketmac.common.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO:
 *
 * @author NiuGeH
 * @description TODO:
 * @Date: 2020/5/11 3:41 下午
 */
@ControllerAdvice
public class GloablExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e){
        e.printStackTrace();
        return new ResultUtils().error(401,e.getMessage() != null ? e.getMessage(): "服务器发生异常");
    }
}
