package com.yuqiyu.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/17/017.
 */
public class UserBean implements Serializable {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
