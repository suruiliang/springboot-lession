package com.yuqiyu.repository;

import com.yuqiyu.entity.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface UserRepository extends JpaRepository<TestUserEntity, Integer> {
}
