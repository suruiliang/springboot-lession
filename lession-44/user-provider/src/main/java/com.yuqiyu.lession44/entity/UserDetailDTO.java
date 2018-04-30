package com.yuqiyu.lession44.entity;

import com.yuqiyu.lession44.mapping.anotations.ResourceField;
import com.yuqiyu.lession44.mapping.enums.CommonResourceFlag;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
public class UserDetailDTO
        extends UserInfoEntity
{
    /**
     * 用户头像
     */
    @ResourceField(flag = CommonResourceFlag.USER_HEAD_IMAGE)
    private String headImage;
    /**
     * 背景图片
     */
    @ResourceField(flag = CommonResourceFlag.USER_BACK_IMAGE,multiple = true)
    private List<String> backImage;
}
