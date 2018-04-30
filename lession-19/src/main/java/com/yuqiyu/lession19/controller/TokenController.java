package com.yuqiyu.lession19.controller;

import com.yuqiyu.lession19.TokenResult;
import com.yuqiyu.lession19.entity.TokenInfoEntity;
import com.yuqiyu.lession19.entity.UserInfoEntity;
import com.yuqiyu.lession19.jpa.TokenJPA;
import com.yuqiyu.lession19.jpa.UserInfoJPA;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018-04-22.
 */
@RestController
@RequestMapping(value = "/jwt")
public class TokenController {
    @Autowired
    private TokenJPA tokenJPA;

    @Autowired
    private UserInfoJPA userInfoJPA;

    /**
     * 获取token，更新token
     *
     * @param appId     用户编号
     * @param appSecret 用户密码
     * @return http://127.0.0.1:8080/jwt/token?appId=c2R4bWtqX21vYmlsZTQ4QTkxMzAwMTkyQzJFMTgzODc0N0NFMzk4MTREM0ZG&appSecret=mKk7r7IJkc+RVjvPh3M4PG6VIGUlgD7jOo3VwkHJKSOL9Qyd7BW1YInvJX/N2MKRXJA/bk3RJ52DN7nKA7dd92Qd++uq+3wSB5SY08qI/Oxp8RIyDV5Q6yaKuAxn0Gg7Efy/CtXubSzJIm9GHgXxgm0yR15aUs8cXCKALbTM4sNV2iOsTNal189XC9ScEzZ20BWlMNGBczgmLz3hFKqbOn/F8DeSZ0C9ZCfA72+JkjZrr1hwWeSxhFZG0qpmff5ZF12LshC869h+7Opzb8FcYeTiqkZrEYnqffc6zUvY053PShXL7dM8FnEFAOGI94WdJPATy6xlElbfMI/iTA+CqQ==
     */
    @RequestMapping(value = "/token", method = {RequestMethod.POST, RequestMethod.GET})
    public TokenResult token
    (
            @RequestParam String appId,
            @RequestParam String appSecret
    ) {
        TokenResult token = new TokenResult();
        //appId is null
        if (appId == null || appId.trim() == "") {
            token.setFlag(false);
            token.setMsg("appId is not found!");
        }
        //appSecret is null
        else if (appSecret == null || appSecret.trim() == "") {
            token.setFlag(false);
            token.setMsg("appSecret is not found!");
        } else {
            //根据appId查询用户实体
            Optional<UserInfoEntity> userDbInfo = userInfoJPA.findOne(new Specification<UserInfoEntity>() {
                @Override
                public Predicate toPredicate(Root<UserInfoEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    criteriaQuery.where(criteriaBuilder.equal(root.get("appId"), appId));
                    return null;
                }
            });
            //如果不存在
//            System.out.println(new String(userDbInfo.get().getAppSecret()));
            if (!userDbInfo.isPresent()) {
                token.setFlag(false);
                token.setMsg("appId : " + appId + ", is not found!");
            }
            //验证appSecret是否存在
            else if (!new String(userDbInfo.get().getAppSecret()).equals(appSecret.replace(" ", "+"))) {
                token.setFlag(false);
                token.setMsg("appSecret is not effective!");
            } else {
                //检测数据库是否存在该appId的token值
                Optional<TokenInfoEntity> tokenDBEntity = tokenJPA.findOne(new Specification<TokenInfoEntity>() {
                    @Override
                    public Predicate toPredicate(Root<TokenInfoEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                        criteriaQuery.where(criteriaBuilder.equal(root.get("appId"), appId));
                        return null;
                    }
                });
                //返回token值
                String tokenStr = null;
                //tokenDBEntity == null -> 生成newToken -> 保存数据库 -> 写入内存 -> 返回newToken
                if (!tokenDBEntity.isPresent()) {
                    //生成jwt,Token
                    tokenStr = createNewToken(appId);
                    //将token保持到数据库
                    TokenInfoEntity tokenDBEntity1 = new TokenInfoEntity();
                    tokenDBEntity1.setAppId(userDbInfo.get().getAppId());
                    tokenDBEntity1.setBuildTime(String.valueOf(System.currentTimeMillis()));
                    tokenDBEntity1.setToken(tokenStr.getBytes());
                    tokenJPA.save(tokenDBEntity1);
                }
                //tokenDBEntity != null -> 验证是否超时 ->
                //不超时 -> 直接返回dbToken
                //超时 -> 生成newToken -> 更新dbToken -> 更新内存Token -> 返回newToken
                else {
                    //判断数据库中token是否过期，如果没有过期不需要更新直接返回数据库中的token即可
                    //数据库中生成时间
                    long dbBuildTime = Long.valueOf(tokenDBEntity.get().getBuildTime());
                    //当前时间
                    long currentTime = System.currentTimeMillis();
                    //如果当前时间 - 数据库中生成时间 < 7200 证明可以正常使用
                    long second = TimeUnit.MILLISECONDS.toSeconds(currentTime - dbBuildTime);
                    if (second > 0 && second < 7200) {
                        tokenStr = new String(tokenDBEntity.get().getToken());
                    }
                    //超时
                    else {
                        //生成newToken
                        tokenStr = createNewToken(appId);
                        //更新token
                        TokenInfoEntity tokenDBEntity1 = tokenDBEntity.get();
                        tokenDBEntity1.setToken(tokenStr.getBytes());
                        //更新生成时间
                        tokenDBEntity1.setBuildTime(String.valueOf(System.currentTimeMillis()));
                        //执行更新
                        tokenJPA.save(tokenDBEntity1);
                    }
                }
                //设置返回token
                token.setToken(tokenStr);
            }
        }
        return token;
    }

    /**
     * 创建新token
     *
     * @param appId
     * @return
     */
    private String createNewToken(String appId) {
        //获取当前时间
        Date now = new Date(System.currentTimeMillis());
        //过期时间
        Date expiration = new Date(now.getTime() + 7200000);
        return Jwts
                .builder()
                .setSubject(appId)
                //.claim(YAuthConstants.Y_AUTH_ROLES, userDbInfo.getRoles())
                .setIssuedAt(now)
                .setIssuer("Online YAuth Builder")
                .setExpiration(expiration)
                .signWith(SignatureAlgorithm.HS256, "HengYuAuthv1.0.0")
                .compact();
    }
}
