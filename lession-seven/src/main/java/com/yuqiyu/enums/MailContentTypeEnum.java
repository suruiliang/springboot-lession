package com.yuqiyu.enums;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),
    TEXT("text");
    private String value;

    MailContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
