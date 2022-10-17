package com.example.vhr.exception;

import com.example.vhr.http.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author wangxiaochao
 * @date 2020-07-20 22:42
 * @description
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public RespBean handleException(Exception e) {
        // 打印异常信息
        log.error("### 异常信息:{} ###", e.getMessage());
        return RespBean.error(e.getMessage());
    }

}
