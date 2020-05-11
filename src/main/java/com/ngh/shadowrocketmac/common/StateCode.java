package com.ngh.shadowrocketmac.common;

/**
 * TODO: 状态
 * @author NiuGeH
 * @date 2019/12/30 12:03
 **/
public enum StateCode {
    /**
     * 成功
     */
    OK(200,"success"),

    /**
     * 失败
     */
    ERROR(400,"fail"),
    /***
     *  分页成功为Code 为0
     *
    **/
    PAGE_OK(0,"success");
    private Integer code;

    private String message;

    StateCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
