package com.yuqiyu.lession44.resource.repository;

import com.yuqiyu.lession44.resource.entity.CommonResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface CommonResourceRepository
        extends JpaRepository<CommonResourceEntity, Integer> {
    /**
     * 根据类型编号 & 目标编号查询出资源实体
     *
     * @param typeId   类型编号
     * @param targetId 目标编号
     * @return
     */
    List<CommonResourceEntity> findByTypeIdAndTargetId(String typeId, String targetId);
}
