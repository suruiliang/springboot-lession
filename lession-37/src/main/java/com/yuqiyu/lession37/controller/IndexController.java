package com.yuqiyu.lession37.controller;

import com.alibaba.fastjson.JSON;
import com.yuqiyu.lession37.annotation.ContentSecurity;
import com.yuqiyu.lession37.annotation.ContentSecurityAttribute;
import com.yuqiyu.lession37.bean.StudentEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Administrator on 2018-04-28.
 */
@RestController
public class IndexController {
    /**
     * @param student
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/submit")
    @ContentSecurity
    public String security
    (@ContentSecurityAttribute("student") @Valid StudentEntity student)
            throws Exception {
        System.out.println(JSON.toJSON(student));

        return "SUCCESS";
    }
}