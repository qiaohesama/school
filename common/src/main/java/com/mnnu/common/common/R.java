package com.mnnu.common.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.Optional;

@ApiModel(
        description = "API响应结果实体类"
)
public class R<T> implements Serializable {
    private static final long serialVersionUID = 2486176761027799992L;
    @ApiModelProperty(
            value = "返回码",
            example = "200",
            required = true
    )
    private Integer code;
    @ApiModelProperty(
            value = "返回描述",
            example = "成功",
            required = true
    )
    private String message;
    @ApiModelProperty(
            value = "返回数据",
            required = true
    )
    private T data;
    @ApiModelProperty(
            value = "是否成功",
            required = true
    )
    private boolean success;

    public R(Integer code, T data, String msg) {
        this.code = code;
        this.message = msg;
        this.data = data;
        this.success = ErrorCode.SUCCESS.code == code;
    }

    public R(IErrorCode resultCode) {
        this(resultCode, null, resultCode.getMessage());
    }

    public R(IErrorCode resultCode, T data, String msg) {
        this(resultCode.getCode(), data, msg);
    }

    public R(IErrorCode resultCode, T data) {
        this(resultCode, data, resultCode.getMessage());
    }

    public R(IErrorCode resultCode, String msg) {
        this(resultCode, null, msg);
    }

    public void setResultCode(IErrorCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.success = ErrorCode.SUCCESS.code == resultCode.getCode();
    }

    public static boolean isSuccess(@Nullable R<?> r) {
        return Optional.ofNullable(r)
                .map(x -> ObjectUtils.nullSafeEquals(ErrorCode.SUCCESS.code, x.code))
                .orElse(Boolean.FALSE);
    }

    public static boolean isFail(@Nullable R<?> r) {
        return !isSuccess(r);
    }

    public static <T> R<T> data(T data) {
        return data(data, "成功");
    }

    public static <T> R<T> data(T data, String msg) {
        return data(ErrorCode.SUCCESS.code, data, msg);
    }

    public static <T> R<T> data(int code, T data, String msg) {
        return new R(code, data, msg == null ? "数据为空" : msg);
    }

    public static <T> R<T> success() {
        return new R(ErrorCode.SUCCESS);
    }

    public static <T> R<T> success(String msg) {
        return new R(ErrorCode.SUCCESS, msg);
    }

    public static <T> R<T> success(IErrorCode resultCode) {
        return new R(resultCode);
    }

    public static <T> R<T> success(IErrorCode resultCode, String msg) {
        return new R(resultCode, msg);
    }

    public static <T> R<T> fail(String msg) {
        return new R(ErrorCode.FAILURE, msg);
    }

    public static <T> R<T> fail(int code, String msg) {
        return new R(code, null, msg);
    }

    public static <T> R<T> fail(IErrorCode resultCode) {
        return new R(resultCode);
    }

    public static <T> R<T> fail(IErrorCode resultCode, String msg) {
        return new R(resultCode, msg);
    }

    public static <T> R<T> fail(IErrorCode resultCode, T data) {
        return new R(resultCode.getCode(), data, resultCode.getMessage());
    }

    public static <T> R<T> status(boolean flag) {
        return flag ? success("成功") : fail("失败");
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public R() {
    }

    @Override
    public String toString() {
        return "Result(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ", success=" + this.isSuccess() + ")";
    }
}
