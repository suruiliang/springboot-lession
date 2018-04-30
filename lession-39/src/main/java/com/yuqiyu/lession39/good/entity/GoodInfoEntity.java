package com.yuqiyu.lession39.good.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2018-04-30.
 */
@Table(name = "basic_good_info")
@Data
@Entity
public class GoodInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bgi_id")
    private Long id;
    /**
     * 商品名称
     */
    @Column(name = "bgi_name")
    private String name;
    /**
     * 商品单位
     */
    @Column(name = "bgi_unit")
    private String unit;
    /**
     * 商品单价
     */
    @Column(name = "bgi_price")
    private BigDecimal price;
}
