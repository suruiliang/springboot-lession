package com.yuqiyu.lession19.jpa;

import com.yuqiyu.lession19.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-04-22.
 */
public interface UserInfoJPA extends JpaRepository<UserInfoEntity, String>,
        JpaSpecificationExecutor<UserInfoEntity> {

}
