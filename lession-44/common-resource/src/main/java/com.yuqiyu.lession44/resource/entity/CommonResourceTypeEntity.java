package com.yuqiyu.lession44.resource.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
@Entity
@Table(name = "hy_common_resource_type")
public class CommonResourceTypeEntity
        extends BaseEntity {
    /**
     * 类型编号
     */
    @Id
    @Column(name = "CRT_ID")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    /**
     * 类型名称
     */
    @Column(name = "CRT_NAME")
    private String name;
    /**
     * 类型标识
     */
    @Column(name = "CRT_FLAG")
    private String flag;
    /**
     * 类型添加时间
     */
    @Column(name = "CRT_CREATE_TIME")
    private Timestamp createTime;
}
