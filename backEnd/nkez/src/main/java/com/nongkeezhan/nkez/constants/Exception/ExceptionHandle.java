package com.nongkeezhan.nkez.constants.Exception;

import com.nongkeezhan.nkez.constants.ResultEnum;
import com.nongkeezhan.nkez.pojo.VO.ResultVO;
import com.nongkeezhan.nkez.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hugay on 2019/3/1
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handler(Exception e) {

        //如果是我们自定义的异常
        if (e instanceof CommonException) {
            CommonException commonException = (CommonException) e;
            return ResultVOUtil.error(commonException.getCode(), commonException.getMessage());
        }
        //如果是系统异常
        else {
            log.error(e.getMessage());
            return ResultVOUtil.error(ResultEnum.SYSTEM_ERROR.getCode(), ResultEnum.SYSTEM_ERROR.getMessage());
        }

    }
}
