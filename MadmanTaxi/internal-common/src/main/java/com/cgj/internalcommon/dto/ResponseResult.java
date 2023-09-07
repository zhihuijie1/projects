package com.cgj.internalcommon.dto;

import com.cgj.internalcommon.constant.CommonStatusEnum;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true) /*链式方法，可以连续的调用set方法，返回的对象是本身*/
public class ResponseResult<T> {

    @Getter
    private int code;
    private String message;
    private T data;

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult success(T data) {
        return new ResponseResult().setCode(CommonStatusEnum.SUCCESS.getCode()).setMessage(CommonStatusEnum.SUCCESS.getValue());
    }

    /**
     * 错误 自定义的错误
     * @param code
     * @param message
     * @return
     * @param <T>
     */
    public static <T> ResponseResult fail(int code, String message) {
        return new ResponseResult().setCode(code).setMessage(message);
    }

    /**
     * 错误 自定义错误，错误的详细信息
     * @param code
     * @param message
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult fail(int code, String message, T data) {
        return new ResponseResult().setCode(code).setMessage(message).setData(data);
    }

    /**
     * 统一的错误信息
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult fail(T data) {
        return new ResponseResult().setData(data);
    }
}
