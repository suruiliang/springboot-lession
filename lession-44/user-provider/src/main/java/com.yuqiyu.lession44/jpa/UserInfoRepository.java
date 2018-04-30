package com.yuqiyu.lession44.jpa;

import com.yuqiyu.lession44.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface UserInfoRepository
        extends JpaRepository<UserInfoEntity, String> {
    /**
     * 根据用户名称查询
     *
     * @param userName
     * @return
     */
    UserInfoEntity findUserInfoEntityByUserName(String userName);
}