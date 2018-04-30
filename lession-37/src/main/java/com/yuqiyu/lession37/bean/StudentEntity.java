package com.yuqiyu.lession37.bean;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Administrator on 2018-04-28.
 */
@Data
public class StudentEntity {
    //学生姓名
    @NotEmpty
    private String name;

    //年龄
    @Min(value = 18, message = "年龄最小18岁")
    private int age;
}
