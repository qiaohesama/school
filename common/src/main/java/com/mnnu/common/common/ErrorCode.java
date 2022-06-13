package com.mnnu.common.common;

/**
 * @author K
 */

public enum ErrorCode implements IErrorCode {
    /**
     * 200 成功
     */
    SUCCESS(200, "成功"),
    /**
     * 4xx 客户端错误
     */
    FAILURE(400, "请求错误"),
    PARAM_ERROR(400, "参数错误"),

    UNAUTHORIZED(401, "用户未登录"),

    FORBIDDEN(403, "没有权限"),

    NOTFOUND(404, "内容不存在"),
    /**
     * 5xx 服务器错误
     */
    TIMEOUT(504, "系统繁忙"),
    UNKNOWN(500, "未知错误");

    final int code;
    final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public int getCode() {
        return this.code;
    }
}
