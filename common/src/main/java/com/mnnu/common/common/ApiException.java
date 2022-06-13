package com.mnnu.common.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ApiException extends RuntimeException {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误消息
     */
    private String message;

    public ApiException() {
        this.code = ErrorCode.FAILURE.getCode();
        this.message = ErrorCode.FAILURE.getMessage();
    }

    public ApiException(IErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public ApiException(String message) {
        this.code = ErrorCode.FAILURE.getCode();
        this.message = message;
    }

    public ApiException(IErrorCode errorCode, String message) {
        this.code = errorCode.getCode();
        this.message = message;
    }
}
