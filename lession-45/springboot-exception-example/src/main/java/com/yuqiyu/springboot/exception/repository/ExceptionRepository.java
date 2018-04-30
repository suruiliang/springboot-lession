package com.yuqiyu.springboot.exception.repository;

import com.yuqiyu.springboot.exception.entity.ExceptionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface ExceptionRepository
        extends JpaRepository<ExceptionInfoEntity, Integer> {
    /**
     * 根据异常码获取异常配置信息
     *
     * @param code 异常码
     * @return
     */
    ExceptionInfoEntity findTopByCode(String code);
}
