package com.yuqiyu.jpa;

import com.yuqiyu.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public interface LoggerJPA
        extends JpaRepository<LoggerEntity, Long> {

}