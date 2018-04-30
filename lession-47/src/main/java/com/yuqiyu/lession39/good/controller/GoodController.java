package com.yuqiyu.lession39.good.controller;

import com.yuqiyu.lession39.good.entity.GoodInfoEntity;
import com.yuqiyu.lession39.good.service.GoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-30.
 */
@RestController
@RequestMapping(value = "/good")
public class GoodController {
    /**
     * 商品业务逻辑实现
     */
    @Autowired
    private GoodInfoService goodInfoService;

    /**
     * 添加商品
     * http://localhost:8083/good/save?name=abcd&unit=斤&price=12.5
     * @return
     */
    @RequestMapping(value = "/save")
    public Long save(GoodInfoEntity good) throws Exception {
        return goodInfoService.saveGood(good);
    }

}
