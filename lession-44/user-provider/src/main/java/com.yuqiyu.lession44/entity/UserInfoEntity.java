package com.yuqiyu.lession44.entity;

import com.yuqiyu.lession44.resource.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
@Entity
@Table(name = "hy_user_info")
public class UserInfoEntity
        extends BaseEntity
{
    /**
     * 用户编号
     */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "UI_ID")
    private String userId;
    /**
     * 用户名
     */
    @Column(name = "UI_NAME")
    private String userName;
    /**
     * 昵称
     */
    @Column(name = "UI_NICK_NAME")
    private String nickName;
    /**
     * 年龄
     */
    @Column(name = "UI_AGE")
    private int age;
    /**
     * 所居地
     */
    @Column(name = "UI_ADDRESS")
    private String address;
}
