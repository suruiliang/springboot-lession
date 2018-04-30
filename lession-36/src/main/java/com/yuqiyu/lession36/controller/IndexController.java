package com.yuqiyu.lession36.controller;

import com.alibaba.fastjson.JSON;
import com.yuqiyu.lession36.annotation.ParameterModel;
import com.yuqiyu.lession36.bean.StudentEntity;
import com.yuqiyu.lession36.bean.TeacherEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-26.
 */
@RestController
public class IndexController {
    /**
     * 装载参数测试
     *
     * @return
     */
    @RequestMapping(value = "/submit")
    public String resolver(@ParameterModel TeacherEntity teacher, @ParameterModel StudentEntity student) {
        return "教师名称：" + JSON.toJSON(teacher.getName()) + "，学生名称：" + student.getName() + "，学生年龄：" + student.getAge();
    }
}
