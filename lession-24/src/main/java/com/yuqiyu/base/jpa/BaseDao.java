package com.yuqiyu.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/18/018.
 */
public interface BaseDao<T> extends
        JpaRepository<T, Long>,
        JpaSpecificationExecutor<T>,
        Serializable {
}
