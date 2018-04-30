package com.yuqiyu.jpa;

import com.yuqiyu.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public interface UserJPA extends JpaRepository<UserEntity,Long> ,JpaSpecificationExecutor<UserEntity>,Serializable{

    @Query(value = "select * from t_user where t_age>?1",nativeQuery = true)
    public List<UserEntity> nativeQuery(int age);

    @Modifying
    @Transactional
    @Query(value = "delete from t_user where t_name=?1",nativeQuery = true)
    public void deleteQuery(String name);
}
