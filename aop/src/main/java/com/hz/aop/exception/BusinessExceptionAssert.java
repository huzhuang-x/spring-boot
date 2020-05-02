package com.hz.aop.exception;

import java.text.MessageFormat;

/**
 * @description:
 * @author: HuZhuang
 * @time: 2020/5/2 22:50
 */
public interface BusinessExceptionAssert extends IResponseEnum,Assert {
    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }

}
