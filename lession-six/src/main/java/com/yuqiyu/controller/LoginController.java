package com.yuqiyu.controller;

import com.yuqiyu.entity.UserEntity;
import com.yuqiyu.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * Created by Administrator on 2018/4/15/015.
 */
@RestController
@RequestMapping(value = "/user")
public class LoginController {
    @Autowired
    private UserJPA userJPA;

    @PostMapping(value = "/login")
    public String login(UserEntity user, HttpServletRequest request) {
        boolean flag = true;
        String result = "登录成功";
        Optional<UserEntity> userEntity = userJPA.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"), user.getName()));
                return null;
            }
        });
        if (!userEntity.isPresent()) {
            flag = false;
            result = "用户不存在，登录失败";
        } else if (!userEntity.get().getPwd().equals(user.getPwd())) {
            flag = false;
            result = "用户密码不相符，登录失败";
        }
        if (flag) {
            request.getSession().setAttribute("_session_user", userEntity.get());
        }
        return "登录成功";
    }
}
