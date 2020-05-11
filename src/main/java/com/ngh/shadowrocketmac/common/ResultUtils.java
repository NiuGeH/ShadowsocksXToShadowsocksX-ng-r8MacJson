package com.ngh.shadowrocketmac.common;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * TODO:
 *
 * @author NiuGeH
 * @version 1.0
 * @description TODO
 * @date 2019/12/30 12:14
 **/
@Component
public class ResultUtils implements Serializable {

//    private static String RSA_PUBLICAKEY;

//    @Value("${RSA_PUBLICAKEY}")
//    public void setUrl(String RSA_PUBLICAKEY) {
//        ResultUtils.RSA_PUBLICAKEY = RSA_PUBLICAKEY;
//    }


    public ResultUtils() {
    }

    public static ResultModel ok(Object data, String message){
//        AesUtils aesUtils = new AesUtils();
//        System.out.println(RSA_PUBLICAKEY);
        return new ResultModel(data, StateCode.OK.getCode(),message);
    }

    public static ResultModel pageOk(Object data,long count){
        return new ResultModel(data,StateCode.PAGE_OK.getCode(),StateCode.PAGE_OK.getMessage(),count);
    }

    public static ResultModel ok(Object data){
        return ok(data, StateCode.OK.getMessage());
    }

    public static ResultModel ok(){
        return ok(null);
    }
    public static ResultModel ok(Object data,Integer code){
        return new ResultModel(data,code, StateCode.OK.getMessage());
    }

    public static ResultModel error(Integer code,String message){
        return new ResultModel(null,code,message);
    }

    public static ResultModel error(String message){
        return error(StateCode.ERROR.getCode(),message);
    }

    public static ResultModel error(){
        return error(StateCode.ERROR.getCode(),StateCode.ERROR.getMessage());
    }
}