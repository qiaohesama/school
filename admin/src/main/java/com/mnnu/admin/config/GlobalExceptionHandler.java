package com.mnnu.admin.config;

import com.mnnu.common.common.ApiException;
import com.mnnu.common.common.ErrorCode;
import com.mnnu.common.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author K
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public R<Void> apiHandler(ApiException e) {
        return R.fail(e.getCode(), e.getMessage());
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R<Void> handler(Exception e, HttpServletRequest request) {
        log.error("未知错误 {}", request.getRequestURI(), e);
        return R.fail(ErrorCode.UNKNOWN, e.getMessage());
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public R<Void> argHandler(MethodArgumentNotValidException e) {
        String message = "";
        FieldError fieldError = e.getBindingResult().getFieldError();
        if (fieldError != null) {
            message = String.format("%s %s", fieldError.getField(), fieldError.getDefaultMessage());
        }
        return R.fail(ErrorCode.PARAM_ERROR, "参数错误: " + message);
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public R<Void> httpRequestMethodHandler(HttpRequestMethodNotSupportedException e) {
        return R.fail(ErrorCode.NOTFOUND);
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public R<Void> illegalStateHandler(IllegalStateException e) {
        String message =  e.getMessage();
        return R.fail(ErrorCode.PARAM_ERROR, "参数错误：" + message);
    }
}
