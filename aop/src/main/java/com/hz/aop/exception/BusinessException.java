package com.hz.aop.exception;

/**
 * @description:
 * @author: HuZhuang
 * @time: 2020/5/2 22:43
 */
public class BusinessException extends BaseException {

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}
