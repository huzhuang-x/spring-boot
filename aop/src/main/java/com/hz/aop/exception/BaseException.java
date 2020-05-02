package com.hz.aop.exception;


/**
 * @description:
 * @author: HuZhuang
 * @time: 2020/5/2 22:36
 */
public class BaseException extends RuntimeException {

    int code;

    public BaseException() {
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String message) {
        super(message);
        this.code = responseEnum.getCode();
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.code = responseEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
