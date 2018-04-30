package com.yuqiyu.controller;

import com.yuqiyu.entity.UserEntity;
import com.yuqiyu.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/4/15/015.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    @GetMapping(value = "/list")
    public List<UserEntity> list() {
        return userJPA.findAll();
    }

    @PostMapping(value = "/save")
    public UserEntity save(UserEntity entity) {
        return userJPA.save(entity);
    }

    @DeleteMapping(value = "/delete")
    public List<UserEntity> delete(Long id) {
        userJPA.deleteById(id);
        return userJPA.findAll();
    }

}
