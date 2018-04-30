package com.yuqiyu.lession44.resource.repository;

import com.yuqiyu.lession44.resource.entity.CommonResourceTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface CommonResourceTypeRepository
        extends JpaRepository<CommonResourceTypeEntity, String> {
    /**
     * 根据类别标识查询
     *
     * @param flag 资源类型标识
     * @return
     */
    CommonResourceTypeEntity findTopByFlag(String flag);
}