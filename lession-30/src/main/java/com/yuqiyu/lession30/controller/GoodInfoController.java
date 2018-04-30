package com.yuqiyu.lession30.controller;

import com.yuqiyu.lession30.bean.GoodInfoBean;
import com.yuqiyu.lession30.bean.GoodTypeBean;
import com.yuqiyu.lession30.dto.GoodInfoDTO;
import com.yuqiyu.lession30.jpa.GoodInfoJPA;
import com.yuqiyu.lession30.jpa.GoodTypeJPA;
import com.yuqiyu.lession30.mapper.GoodInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-23.
 */
@RestController
public class GoodInfoController {
    /**
     * 注入商品基本信息jpa
     */
    @Autowired
    private GoodInfoJPA goodInfoJPA;
    /**
     * 注入商品类型jpa
     */
    @Autowired
    private GoodTypeJPA goodTypeJPA;
    /**
     * 注入mapStruct转换Mapper
     */
    @Autowired
    private GoodInfoMapper goodInfoMapper;

    /**
     * 查询商品详情
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    public GoodInfoDTO detail(@PathVariable("id") Long id) {
        //查询商品基本信息
        GoodInfoBean goodInfoBean = goodInfoJPA.findById(id).get();
        //查询商品类型基本信息
        GoodTypeBean typeBean = goodTypeJPA.findById(goodInfoBean.getTypeId()).get();
        //返回转换dto
        return goodInfoMapper.from(goodInfoBean, typeBean);
    }
}
