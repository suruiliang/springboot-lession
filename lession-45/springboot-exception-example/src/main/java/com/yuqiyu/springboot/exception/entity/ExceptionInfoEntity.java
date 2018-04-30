package com.yuqiyu.springboot.exception.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
@Entity
@Table(name = "sys_exception_info")
public class ExceptionInfoEntity implements Serializable {
    /**
     * 异常消息编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EI_ID")
    private Integer id;
    /**
     * 异常消息错误码
     */
    @Column(name = "EI_CODE")
    private String code;
    /**
     * 异常消息内容
     */
    @Column(name = "EI_MESSAGE")
    private String message;
}
