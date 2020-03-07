package com.nongkeezhan.nkez.constants.Exception;

/**
 * Created by hugay on 2019/3/1
 */
public class CommonException extends RuntimeException {
    private Integer code;
    private String exceptionMessage;

    public Integer getCode() {
        return code;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public CommonException(Integer code, String exceptionMessage) {
        super(exceptionMessage);
        this.code = code;
    }
}
