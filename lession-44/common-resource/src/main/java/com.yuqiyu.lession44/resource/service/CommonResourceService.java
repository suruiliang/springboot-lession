package com.yuqiyu.lession44.resource.service;

import com.yuqiyu.lession44.mapping.enums.CommonResourceFlag;
import com.yuqiyu.lession44.resource.entity.CommonResourceEntity;
import com.yuqiyu.lession44.resource.entity.CommonResourceTypeEntity;
import com.yuqiyu.lession44.resource.repository.CommonResourceRepository;
import com.yuqiyu.lession44.resource.repository.CommonResourceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018-04-29.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CommonResourceService {
    /**
     * 资源类型数据接口
     */
    @Autowired
    private CommonResourceTypeRepository resourceTypeRepository;
    /**
     * 资源数据接口
     */
    @Autowired
    private CommonResourceRepository resourceRepository;

    /**
     * 根据资源标识 & 所属目标编号查询资源路径路边
     *
     * @param resourceFlag 资源标识
     * @param targetId     目标编号
     * @return
     */
    public List<String> selectUrlsByFlag(CommonResourceFlag resourceFlag, String targetId) throws Exception {
        /**
         * 获取资源类型
         */
        CommonResourceTypeEntity resourceType = selectResourceTypeByFlag(resourceFlag);
        /**
         * 查询该目标编号 & 类型的资源列表
         */
        List<CommonResourceEntity> resources = resourceRepository.findByTypeIdAndTargetId(resourceType.getId(), targetId);

        return convertUrl(resources);
    }

    /**
     * 转换路径
     * 通过实体集合转换成路径集合
     *
     * @param resources 资源实体列表
     * @return
     */
    List<String> convertUrl(List<CommonResourceEntity> resources) {
        List<String> urls = null;
        if (!ObjectUtils.isEmpty(resources)) {
            urls = new ArrayList();
            for (CommonResourceEntity resource : resources) {
                urls.add(resource.getResourceUrl());
            }
        }

        return urls;
    }

    /**
     * 根据资源类型标识查询资源类型基本信息
     *
     * @param resourceFlag 资源类型标识
     * @return
     * @throws Exception
     */
    CommonResourceTypeEntity selectResourceTypeByFlag(CommonResourceFlag resourceFlag) throws Exception {
        /**
         * 查询资源类型
         */
        CommonResourceTypeEntity resourceType = resourceTypeRepository.findTopByFlag(resourceFlag.getName());
        if (ObjectUtils.isEmpty(resourceFlag)) {
            throw new Exception("未查询到资源");
        }
        return resourceType;
    }

}
