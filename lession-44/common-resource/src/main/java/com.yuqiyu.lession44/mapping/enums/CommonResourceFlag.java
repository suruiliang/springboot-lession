package com.yuqiyu.lession44.mapping.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018-04-29.
 */
@Getter
public enum CommonResourceFlag {
    /**
     * 用户头像
     */
    USER_HEAD_IMAGE("USER_HEAD_IMAGE"),
    /**
     * 用户背景图片
     */
    USER_BACK_IMAGE("USER_BACK_IMAGE");
    private String name;

    CommonResourceFlag(String name) {
        this.name = name;
    }
}
