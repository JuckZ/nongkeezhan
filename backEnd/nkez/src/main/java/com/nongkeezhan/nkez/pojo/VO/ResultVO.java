package com.nongkeezhan.nkez.pojo.VO;

import lombok.Data;

/**
 * Created by hugay on 2019/2/27
 */
@Data
public class ResultVO {
    /** 状态码 */
    private Integer code;

    /** 状态信息 */
    private String message;

    /** 将要返回的具体内容 */
    private Object data;

    public ResultVO() {
    }

    public ResultVO(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
