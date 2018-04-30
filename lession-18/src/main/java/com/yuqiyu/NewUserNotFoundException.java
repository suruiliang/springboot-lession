package com.yuqiyu;

/**
 * Created by Administrator on 2018/4/22/022.
 */
public class NewUserNotFoundException
        extends RuntimeException {

    public NewUserNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public NewUserNotFoundException(String msg) {
        super(msg);
    }
}
