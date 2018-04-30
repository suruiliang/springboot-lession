package com.yuqiyu.lession19.jpa;

import com.yuqiyu.lession19.entity.TokenInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2018-04-22.
 */
public interface TokenJPA extends JpaRepository<TokenInfoEntity, String>,
        JpaSpecificationExecutor<TokenInfoEntity> {
}
