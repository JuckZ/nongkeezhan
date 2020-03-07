package com.nongkeezhan.nkez.utils;

import com.nongkeezhan.nkez.constants.ResultEnum;
import com.nongkeezhan.nkez.pojo.VO.ResultVO;

/**
 * Created by hugay on 2019/2/27
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        return new ResultVO(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), object);
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(ResultEnum resultEnum) {
        return new ResultVO(resultEnum.getCode(), resultEnum.getMessage());
    }

    public static ResultVO error(Integer code, String message) {
        return new ResultVO(code, message);
    }
}
