package com.yuqiyu.controller;

import com.yuqiyu.entity.UserEntity;
import com.yuqiyu.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    @GetMapping(value = "/age")
    public List<UserEntity> age(int age) {
        return userJPA.nativeQuery(age);
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

    @DeleteMapping(value = "/deleteWhere")
    public List<UserEntity> deleteWhere(String name) {
        userJPA.deleteQuery(name);
        return userJPA.findAll();
    }

    @GetMapping(value = "/cutpage")
    public List<UserEntity> cutPage(UserEntity user) {
        Sort.Direction sort_direction = Sort.Direction.ASC.toString().equalsIgnoreCase(user.getSord()) ? Sort.Direction.ASC : Sort.Direction.DESC;
        Sort sort = new Sort(sort_direction, user.getSidx());
        PageRequest pageRequest = new PageRequest(user.getPage() - 1, user.getSize(), sort);
        Page<UserEntity> pageList = userJPA.findAll(pageRequest);
        System.out.println(pageList.getSize());
        System.out.println(pageList.getTotalElements());
        return pageList.getContent();
    }
}
