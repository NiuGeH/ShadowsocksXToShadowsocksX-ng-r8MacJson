package com.ngh.shadowrocketmac.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * TODO:
 *
 * @author NiuGeH
 * @version 1.0
 * @description TODO
 * @date 2019/12/30 12:00
 **/
@Setter
@Getter
@ToString
public class ResultModel<T> implements Serializable {

    private T data;

    private Integer code;

    private String message;

    private long count;

    public ResultModel(T data, Integer code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public ResultModel(T data, Integer code, String message, long count) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.count = count;
    }

    public ResultModel() {
    }
}