package com.hz.aop.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author: HuZhuang
 * @time: 2020/5/2 22:53
 */
@Getter
@AllArgsConstructor
public enum  ResponseEnum implements BusinessExceptionAssert {

    /**
     * Bad licence type
     */
    BAD_LICENCE_TYPE(7001, "Bad licence type."),
    /**
     * Licence not found
     */
    LICENCE_NOT_FOUND(7002, "Licence not found.")
    ;
    private int code;
    private String message;
}
