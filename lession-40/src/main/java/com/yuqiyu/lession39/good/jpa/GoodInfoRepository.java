package com.yuqiyu.lession39.good.jpa;

import com.yuqiyu.lession39.good.entity.GoodInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-30.
 */
public interface GoodInfoRepository extends JpaRepository<GoodInfoEntity,Long> {
}
